package com.lhst.springboot_project.mq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

//@Component
public class DirectReceiver {
    @RabbitListener(queues = "hello-QUEUE")
    public void handler1(String msg) {
        System.out.println("DirectReceiver:" + msg);
    }
}