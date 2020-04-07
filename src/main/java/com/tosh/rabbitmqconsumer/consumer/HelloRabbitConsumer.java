package com.tosh.rabbitmqconsumer.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

/*@Service*/
public class HelloRabbitConsumer {

    @RabbitListener(queues = "hello")
    public void listen(String message){
        System.out.println("Consuming " + message);
    }
}
