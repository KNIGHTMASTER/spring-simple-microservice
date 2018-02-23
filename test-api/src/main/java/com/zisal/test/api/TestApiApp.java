package com.zisal.test.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2/19/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class TestApiApp {

    public static void main(String [] args) {
        SpringApplication.run(TestApiApp.class);
    }

    @GetMapping("/")
    public String testAPIDefaulResponse() {
        return "1";
    }
}
