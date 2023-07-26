package com.example.springbootkafawithserializer.Controller;

import com.example.springbootkafawithserializer.entity.User;
import com.example.springbootkafawithserializer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/kafka")
public class Usercontoller {

    @Autowired
    UserService userService;

    @PostMapping("publish_message")
    public ResponseEntity<String> sendMessage(@RequestBody User user){
        userService.sendMessage(user);
        return ResponseEntity.ok("message sent");
    }
}
