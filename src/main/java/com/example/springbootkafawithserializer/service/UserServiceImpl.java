package com.example.springbootkafawithserializer.service;

import com.example.springbootkafawithserializer.config.KafkaProducerConfig;
import com.example.springbootkafawithserializer.entity.User;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;


@Service
public class UserServiceImpl implements UserService{
    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(UserService.class);

    @Autowired
    KafkaTemplate<String , User> kafkaTemplate;
    @Override
    public void sendMessage(User user) {
        LOGGER.info("message sent : " + user.toString());
        Message<User> message = MessageBuilder.withPayload(user).build();
        kafkaTemplate.send(message);
    }
}
