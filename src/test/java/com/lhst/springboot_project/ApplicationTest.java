package com.lhst.springboot_project;

import com.lhst.springboot_project.mq.RabbitFanoutConfig;
import com.lhst.springboot_project.mq.RabbitTopicConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {
    @Autowired
    RabbitTemplate rabbitTemplate;

    @Test
    public void directTest() {
        rabbitTemplate.convertAndSend("hello-QUEUE", "hello direct!");
    }
    @Test
    public void fanoutTest() {
        rabbitTemplate.convertAndSend(RabbitFanoutConfig.FANOUTNAME,
                        null, "hello fanout!");
    }

    @Test
    public void topicTest() {
        rabbitTemplate.convertAndSend(RabbitTopicConfig.TOPICNAME,
                "xiaomi.news","小米新闻..");
        rabbitTemplate.convertAndSend(RabbitTopicConfig.TOPICNAME,
                "huawei.news","华为新闻..");
        rabbitTemplate.convertAndSend(RabbitTopicConfig.TOPICNAME,
                "xiaomi.phone","小米手机..");
        rabbitTemplate.convertAndSend(RabbitTopicConfig.TOPICNAME,
                "huawei.phone","华为手机..");
        rabbitTemplate.convertAndSend(RabbitTopicConfig.TOPICNAME,
                "phone.news","手机新闻..");
    }
}