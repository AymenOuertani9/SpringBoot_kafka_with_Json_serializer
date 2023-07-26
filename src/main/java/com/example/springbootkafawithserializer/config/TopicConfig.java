package com.example.springbootkafawithserializer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicConfig {

    public NewTopic UserTopic(){
        return TopicBuilder.name("user").build();
    }
}
