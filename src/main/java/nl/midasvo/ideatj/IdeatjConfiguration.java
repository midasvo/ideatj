package nl.midasvo.ideatj;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan( basePackages = {"nl.midasvo.ideatj"})
@EnableJpaRepositories(basePackages = "nl.midasvo.ideatj.repository")
public class IdeatjConfiguration {
}
