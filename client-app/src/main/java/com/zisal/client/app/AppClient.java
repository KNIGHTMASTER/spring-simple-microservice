package com.zisal.client.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created on 2/13/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AppClient {

    public static final String ACCOUNTS_SERVICE_URL = "http://account-api";

    public static void main(String[] args) {
        SpringApplication.run(AppClient.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public AccountRepository accountRepository(){
        return new RemoteAccountRepository(ACCOUNTS_SERVICE_URL);
    }
}
