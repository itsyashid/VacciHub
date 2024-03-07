package com.project.vaccihub.Controllers;

import com.project.vaccihub.Dtos.RequestDtos.*;
import com.project.vaccihub.Models.User;
import com.project.vaccihub.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addNew")
    public String add(@RequestBody AddUserDto addUserDto) {
        try {
            return userService.add(addUserDto);
        } catch (Exception re) {
            return re.getMessage();
        }
    }

    @GetMapping("/getById/{userId}")
    public ResponseEntity<String> getUserById(@PathVariable Integer userId) {
        try {
            User user = userService.getUserById(userId);
            return new ResponseEntity<>(user.getName(), HttpStatus.FOUND);
        } catch (Exception re) {
            return new ResponseEntity<>(re.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/getByEmailId/{emailId}")
    public ResponseEntity<String> getUserByEmailId(@PathVariable String emailId) {
        try {
            User user = userService.getUserByEmailId(emailId);
            return new ResponseEntity<>(user.getName(), HttpStatus.FOUND);
        } catch (Exception re) {
            return new ResponseEntity<>(re.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/getVaccinatedDate")
    public ResponseEntity<String> getVaccinatedDate(@RequestParam("userId") Integer userId) {
        try {
            Date date = userService.getVaccinatedDate(userId);
            return new ResponseEntity<>(date.toString(), HttpStatus.FOUND);
        } catch (Exception re) {
            return new ResponseEntity<>(re.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/updateUserEmail")
    public ResponseEntity<String> updateUserEmail(@RequestBody UpdateEmailDto updateEmailDto) {
        try {
            String result = userService.updateEmailDto(updateEmailDto);
            return new ResponseEntity<>(result, HttpStatus.CREATED);
        } catch (Exception re) {
            return new ResponseEntity<>(re.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}