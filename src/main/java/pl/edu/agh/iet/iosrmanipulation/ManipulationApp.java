package pl.edu.agh.iet.iosrmanipulation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ManipulationApp {
    public static void main(String[] args) {
        SpringApplication.run(ManipulationApp.class, args);
    }
}