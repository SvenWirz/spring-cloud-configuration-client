package de.sven_wirz.spring.cloud.configurationclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigurationClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigurationClientApplication.class, args);
    }

}
