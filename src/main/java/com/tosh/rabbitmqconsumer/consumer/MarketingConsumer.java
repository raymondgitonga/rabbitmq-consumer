package com.tosh.rabbitmqconsumer.consumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tosh.rabbitmqconsumer.entity.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class MarketingConsumer {

    private ObjectMapper objectMapper = new ObjectMapper();

    private static final Logger log = LoggerFactory.getLogger(MarketingConsumer.class);

    @RabbitListener(queues = "q.hr.marketing")
    public void listen(String message) throws IOException {
        var emp = objectMapper.readValue(message, Employee.class);

        log.info("Marketting Employee is {} ", emp);


    }

}
