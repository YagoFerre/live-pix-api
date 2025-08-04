package yago.ferreira.notification.infra.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {
    public static final String SENT_NOTIFICATION_QUEUE = "notification.v1.sent-notification";

    /**
     * cria uma fila
     */
    @Bean
    public Queue queue() {
        return new Queue(SENT_NOTIFICATION_QUEUE);
    }
}
