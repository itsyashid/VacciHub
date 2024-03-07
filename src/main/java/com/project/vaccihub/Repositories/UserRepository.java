package com.project.vaccihub.Repositories;

import com.project.vaccihub.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    //we just define the function to execute:

    Optional<User> findByEmailId(String emailId);
    //prebuilt functions : and we can use it directly....


}