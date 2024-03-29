package com.project.vaccihub.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Optional;
import com.project.vaccihub.Dtos.RequestDtos.*;
import com.project.vaccihub.Exceptions.*;
import com.project.vaccihub.Models.*;
import com.project.vaccihub.Repositories.*;
import com.project.vaccihub.Transformers.*;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String add(AddUserDto userDto) throws EmailShouldNotNullException, EmailIsAlreadyPresent{
        if(userDto.getEmailId() == null) {
            throw new EmailShouldNotNullException();
        }
        Optional<User> userOpt = userRepository.findByEmailId(userDto.getEmailId());
        if(userOpt.isPresent()) {
            throw new EmailIsAlreadyPresent();
        }
        User user = UserTransformer.userDtoToUser(userDto);
        userRepository.save(user);
        return "User has been added successfully";
    }

    public Date getVaccinatedDate(Integer userId) throws UserNotFound, UserIsNotVaccinated{
        Optional<User> userOpt = userRepository.findById(userId);
        if(userOpt.isEmpty()) {
            throw new UserNotFound();
        }
        User user = userOpt.get();
        if(user.getDose() == null) {
            throw new UserIsNotVaccinated();
        }
        Dose dose = user.getDose();
        return dose.getVaccinationDate();
    }

    public String updateEmailDto(UpdateEmailDto updateEmailDto) throws UserNotFound, OldEmailIdIsNotMatching{
        Integer userId = updateEmailDto.getUserId();
        Optional<User> userOpt = userRepository.findById(userId);
        if(userOpt.isEmpty()) {
            throw new UserNotFound();
        }

        User user = userOpt.get();
        if(!user.getEmailId().equals(updateEmailDto.getOldEmailId())) {
            throw new OldEmailIdIsNotMatching();
        }
        user.setEmailId(updateEmailDto.getNewEmailId());
        userRepository.save(user);

        return "Old Email has been replaced by: "+updateEmailDto.getNewEmailId();
    }

    public User getUserById(Integer userId) throws UserNotFound {
        Optional<User> userOpt = userRepository.findById(userId);
        if(userOpt.isEmpty()) {
            throw new UserNotFound();
        }
        return userOpt.get();
    }

    public User getUserByEmailId(String emailId) throws UserNotFound {
        Optional<User> userOpt = userRepository.findByEmailId(emailId);
        if(userOpt.isEmpty()) {
            throw new UserNotFound();
        }
        return userOpt.get();
    }
}