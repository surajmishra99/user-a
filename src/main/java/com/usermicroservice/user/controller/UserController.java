package com.usermicroservice.user.controller;

import com.usermicroservice.user.entity.UserEntity;
import com.usermicroservice.user.model.Request;
import com.usermicroservice.user.model.Response;
import com.usermicroservice.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user-service/v1")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public Response userRegister(@Valid @RequestBody Request request){
        return this.userService.addData(request);
    }

    @GetMapping("/getalluser")
    public List<UserEntity> getAll(){
        return this.userService.getAll();
    }
}
