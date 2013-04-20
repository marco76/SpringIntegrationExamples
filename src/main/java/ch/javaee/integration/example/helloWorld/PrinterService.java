package ch.javaee.integration.example.helloWorld;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

/**
 * This service consume the message and print it on the console
 */

@Component
public class PrinterService {


    // if only one method is present in the class the @ServiceActivator is not necessary
    // in alternative the method has to be explicitly declared in the configuration

    @ServiceActivator
    public void printValue(String value){
        System.out.println(value);
    }
}
