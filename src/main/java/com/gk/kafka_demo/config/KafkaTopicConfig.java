package com.gk.kafka_demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic gkTopic(){
        return TopicBuilder.name("gktopic").build();
    }


    @Bean
    public NewTopic gkJsonTopic(){
        return TopicBuilder.name("gk_json_topic").build();
    }


}
