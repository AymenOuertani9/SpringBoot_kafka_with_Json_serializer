package com.example.springbootkafawithserializer.service;

import com.example.springbootkafawithserializer.entity.User;

public interface UserService {

    public void sendMessage(User user);
}
