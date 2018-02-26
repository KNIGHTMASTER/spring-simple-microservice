package com.zisal.admin.server;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created on 2/26/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@SpringBootApplication
@EnableAdminServer
public class AdminServerApplication {

    public static void main(String [] args){
        SpringApplication.run(AdminServerApplication.class);
    }
}
