package yago.ferreira.pixapi.infra.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    public static final String NOTIFICATION_CREATED_QUEUE = "notification-created-queue";
}
