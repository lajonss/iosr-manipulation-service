package pl.edu.agh.iet.iosrmanipulation;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.edu.agh.iet.iosrmanipulation.manipulator.AdditiveManipulator;
import pl.edu.agh.iet.iosrmanipulation.manipulator.Manipulator;
import pl.edu.agh.iet.iosrmanipulation.manipulator.MultiplicativeManipulator;

@Configuration
@ConfigurationProperties(prefix = "manipulator")
public class ManipulationConfig {
    String operation;

    @Bean
    Manipulator getManipulator() {
        if (operation.compareTo("ADD") == 0)
            return new AdditiveManipulator();
        else if (operation.compareTo("MULTIPLY") == 0)
            return new MultiplicativeManipulator();
        return new Manipulator();
    }
}