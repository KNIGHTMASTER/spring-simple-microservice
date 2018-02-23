package com.zisal.aggregator.ap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Created on 2/19/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@SpringBootApplication
@EnableTurbine
@EnableEurekaClient
public class AggregatorApp {

    public static void main(String [] args) {
        SpringApplication.run(AggregatorApp.class);
    }
}
