package com.sachidanand.pulsethread;

import com.sachidanand.pulsethread.config.OpenAPIConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@Import(OpenAPIConfiguration.class)
public class PulseThreadApplication {

    public static void main(String[] args) {
        SpringApplication.run(com.sachidanand.pulsethread.PulseThreadApplication.class, args);
    }

}
