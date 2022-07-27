package com.usermicroservice.user.service;

import com.usermicroservice.user.entity.UserEntity;
import com.usermicroservice.user.model.Request;
import com.usermicroservice.user.model.Response;
import com.usermicroservice.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> getAll(){
        return userRepository.findAll();
    }

    public Response addData(Request request) {
        try {
            if (this.userRepository.isExitNumber(request.getUser_phone())) {
                return new Response(true, "Your Mobile NUmber already exist");
            } else {
                UUID uuid = UUID.randomUUID();
                UserEntity data = UserEntity.builder()
                        .uuid(String.valueOf(uuid))
                        .user_name(request.getUser_name())
                        .user_email(request.getUser_email())
                        .user_phone(request.getUser_phone())
                        .user_gender(request.getUser_gender())
                        .user_dob(request.getUser_dob())
                        .user_address(request.getUser_address())
                        .build();
                this.userRepository.save(data);
                return new Response(false, "You have SuccessFully Register");
            }
        } catch (Exception e) {
            return new Response(true, "Internal Server Error");
        }
    }

    public Response updateData(Long mobileNo, Request request) {
        return null;
    }
}
//