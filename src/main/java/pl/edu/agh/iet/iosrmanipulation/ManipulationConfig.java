package pl.edu.agh.iet.iosrmanipulation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.edu.agh.iet.iosrmanipulation.manipulator.AdditiveManipulator;
import pl.edu.agh.iet.iosrmanipulation.manipulator.Manipulator;
import pl.edu.agh.iet.iosrmanipulation.manipulator.MultiplicativeManipulator;

@Configuration
public class ManipulationConfig {
    @Value("${manipulator.operation}")
    private String operation;

    @Bean
    Manipulator getManipulator() {
        if (operation.compareTo("ADD") == 0)
            return new AdditiveManipulator();
        else if (operation.compareTo("MULTIPLY") == 0)
            return new MultiplicativeManipulator();
        return new Manipulator();
    }
}