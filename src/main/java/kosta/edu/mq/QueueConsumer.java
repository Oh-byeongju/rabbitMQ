package kosta.edu.mq;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class QueueConsumer {
    @RabbitListener(queues = "myq")
    public void consume(Message message) {
        System.out.println(message.toString());
    }
}
