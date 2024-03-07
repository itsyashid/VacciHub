package com.project.vaccihub.Transformers;

import com.project.vaccihub.Dtos.RequestDtos.*;
import com.project.vaccihub.Models.User;

public class UserTransformer {

    public static User userDtoToUser(AddUserDto userDto) {
        User user = User.builder()
                .name(userDto.getName())
                .age(userDto.getAge())
                .emailId(userDto.getEmailId())
                .gender(userDto.getGender())
                .mobileNo(userDto.getMobileNo())
                .build();
        return user;
    }
}