package nl.midasvo.ideatj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class IdeatjApplication {

    public static void main(String[] args) {
        SpringApplication.run(IdeatjApplication.class, args);
    }

}
