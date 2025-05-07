package com.gk.kafka_demo.kafka;

import com.gk.kafka_demo.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger logger= LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "gk_json_topic", groupId = "gkCare")
    public void consume(User user){
        logger.info("Message received -> {}",user);
    }

}
