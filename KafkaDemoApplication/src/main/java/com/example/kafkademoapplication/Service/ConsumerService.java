package com.example.kafkademoapplication.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    private static final Logger log = LoggerFactory.getLogger(ConsumerService.class);

    @KafkaListener(
            topics = "test-topic",
            groupId = "console-consumer-30592"
    )
    public void consumer(String message) {
        log.info("Received message: {}", message);
    }
}