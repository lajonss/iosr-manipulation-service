package pl.edu.agh.iet.iosrmanipulation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.edu.agh.iet.iosrmanipulation.manipulator.Manipulator;

@Configuration
public class ManipulationConfig {
    @Bean
    Manipulator getManipulator() {
        return Manipulator.newManipulator();
    }
}