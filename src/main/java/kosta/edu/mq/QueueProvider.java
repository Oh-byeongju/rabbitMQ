package kosta.edu.mq;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QueueProvider {
    @Autowired
    Queue queue;

    @Autowired
    RabbitTemplate rabbitTemplate;

    public void provide(String msg) {
        rabbitTemplate.convertAndSend(queue.getName(), msg);
    }
}
