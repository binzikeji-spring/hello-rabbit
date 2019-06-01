package com.binzikeji.hello.rabbit;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author Bin
 * @Date 2019/6/1 17:31
 **/
@Component
public class HelloRabbitProvider {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        String context = "hello" + System.currentTimeMillis();
        System.out.println("Provider: " + context);
        amqpTemplate.convertAndSend("helloRabbit", context);

    }

}
