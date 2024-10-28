package kosta.edu.mq;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KostamqProviderTest {

	@Autowired
	QueueProvider queueProvider;

	@Test
	void testProvider () {
		String msg = "Hello SpringBoot RabbitMQ";
		queueProvider.provide(msg);
	}
}
