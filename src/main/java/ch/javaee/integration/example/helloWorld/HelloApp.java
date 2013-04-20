package ch.javaee.integration.example.helloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.Message;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.support.MessageBuilder;

/**
 * The goal of this example is to show how a message can be sent to one input channel,
 * be transformed by a service, sent to a second channel and consumed by a second service
 */
public class HelloApp {
    public static void main(String[] args) {

        // load the Spring context
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        // get the reference to the message channel
        MessageChannel channel = context.getBean("inputChannel", MessageChannel.class);

        // create a message with the content "World"
        Message<String> message = MessageBuilder.withPayload("World").build();

        // send the message to the inputChannel
        channel.send(message);
    }
}
