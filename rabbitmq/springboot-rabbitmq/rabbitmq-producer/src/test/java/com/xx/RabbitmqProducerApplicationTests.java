package com.xx;

import com.xx.config.RabbitMQConfig;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RabbitmqProducerApplicationTests {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    void test() {
        rabbitTemplate.convertAndSend(RabbitMQConfig.BOOT_TOPIC_EXCHANGE, "boot.xx", "boot mq hello!");
    }

}
