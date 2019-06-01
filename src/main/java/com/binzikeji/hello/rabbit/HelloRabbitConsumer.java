package com.binzikeji.hello.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author Bin
 * @Date 2019/6/1 17:49
 **/
@Component
@RabbitListener(queues = "helloRabbit")
public class HelloRabbitConsumer {

    @RabbitHandler
    public void process(String message){
        System.out.println("Consumer: " + message);
    }
}
