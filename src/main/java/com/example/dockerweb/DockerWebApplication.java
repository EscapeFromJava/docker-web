package com.example.dockerweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerWebApplication.class, args);
    }

    @GetMapping("/")
    public String index() {
        return "Hello World!";
    }

    @GetMapping("/help")
    public String help() {
        return "Help";
    }

}
