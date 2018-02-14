package com.zisal.account.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created on 2/13/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AccountApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(AccountApiApplication.class, args);
    }
}
