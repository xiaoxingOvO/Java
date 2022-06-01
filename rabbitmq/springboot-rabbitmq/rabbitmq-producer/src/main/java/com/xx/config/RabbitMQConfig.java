package com.xx.config;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xiaoxing
 * @create 2022-05-04 14:32
 */
@Configuration
public class RabbitMQConfig {

    //交换机名称
    public static final String BOOT_TOPIC_EXCHANGE = "boot_topic_exchange";
    //队列名称
    public static final String BOOT_QUEUE = "boot_queue";

    //声明交换机
    @Bean("bootTopicExchange")
    public Exchange topicExchange(){
        return ExchangeBuilder.topicExchange(BOOT_TOPIC_EXCHANGE).durable(true).build();
    }

    //声明队列
    @Bean("bootQueue")
    public Queue itemQueue(){
        return QueueBuilder.durable(BOOT_QUEUE).build();
    }

    //绑定队列和交换机
    @Bean
    public Binding itemQueueExchange(@Qualifier("bootQueue") Queue queue,
                                     @Qualifier("bootTopicExchange") Exchange exchange){
        return BindingBuilder.bind(queue).to(exchange).with("boot.#").noargs();
    }
}
