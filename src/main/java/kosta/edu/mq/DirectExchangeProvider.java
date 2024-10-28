package kosta.edu.mq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DirectExchangeProvider {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Value("${amq.direct}")
    private String AMQ_DIRECT;

    @Value("${amq.direct.routing-key}")
    private String DIRECT_ROUTING_KEY;

    public void provide(String msg) {
        String message = "Hello Direct Exchange!";
        rabbitTemplate.convertAndSend(AMQ_DIRECT, DIRECT_ROUTING_KEY, message);
    }
}
