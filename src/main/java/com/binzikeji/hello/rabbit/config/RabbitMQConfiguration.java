package com.binzikeji.hello.rabbit.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description
 * @Author Bin
 * @Date 2019/6/1 17:17
 **/
@Configuration
public class RabbitMQConfiguration {

    @Bean
    public Queue queue(){
        return new Queue("helloRabbit");
    }
}
