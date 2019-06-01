package com.binzikeji.hello.rabbit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.ref.PhantomReference;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloRabbitApplicationTests {

    @Autowired
    private HelloRabbitProvider helloRabbitProvider;

    @Test
    public void provider() {
        for (int i = 0; i < 100; i++) {
            helloRabbitProvider.send();
        }
    }

}
