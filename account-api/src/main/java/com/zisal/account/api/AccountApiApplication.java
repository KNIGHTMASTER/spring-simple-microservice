package com.zisal.account.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created on 2/13/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class AccountApiApplication implements CommandLineRunner {

    @Autowired
    private AccountRepository accountRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountApiApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AccountApiApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        accountRepository.deleteAll();

        Account developer = new Account();
        developer.setName("Developer");
        developer.setNumber("1111");
        developer.setAmount(5000L);

        Account analyst = new Account();
        analyst.setName("Analyst");
        analyst.setNumber("2222");
        analyst.setAmount(7000L);

        Account manager = new Account();
        manager.setName("Manager");
        manager.setNumber("3333");
        manager.setAmount(10000L);

        accountRepository.insert(developer);
        accountRepository.insert(analyst);
        accountRepository.insert(manager);

        for(Account account : accountRepository.findAll()) {
            LOGGER.info(account.toString());
        }
        LOGGER.info("Accounts Have Been Created");
    }
}
