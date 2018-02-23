package com.zisal.discovery.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created on Feb 14, 2018
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@EnableAutoConfiguration
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerApp {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServerApp.class, args);
    }
}
