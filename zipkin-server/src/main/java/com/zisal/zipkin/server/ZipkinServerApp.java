package com.zisal.zipkin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * Created on 2/23/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@SpringBootApplication
@EnableZipkinServer
public class ZipkinServerApp {

    public static void main(String [] args) {
        SpringApplication.run(ZipkinServerApp.class);
    }
}
