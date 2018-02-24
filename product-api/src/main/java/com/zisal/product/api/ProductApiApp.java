package com.zisal.product.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;

/**
 * Created on 2/18/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@SpringBootApplication
@EnableEurekaClient
public class ProductApiApp implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductApiApp.class);

    public static void main(String[] args) {
        SpringApplication.run(ProductApiApp.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        LOGGER.info("Start Initializing Product Data");

        if (productRepository.findAll().size() > 0) {
            productRepository.deleteAll();
        }

        Product product1 = new Product();
        product1.setCode("PRD001");
        product1.setName("Human Resource App");
        product1.setRemarks("Finished App");

        Product product2 = new Product();
        product2.setCode("PRD002");
        product2.setName("Database Design");
        product2.setRemarks("Finished Design");

        Product product3 = new Product();
        product3.setCode("PRD003");
        product3.setName("Time Line Development");
        product3.setRemarks("Finished Time Line");

        productRepository.save(product1);
        productRepository.save(product2);
        productRepository.save(product3);

        LOGGER.info("Finished Initializing Product Data");
    }

    @Bean
    AlwaysSampler alwaysSampler() {
        return new AlwaysSampler();
    }
}
