package pl.edu.agh.iet.iosrmanipulation.manipulator;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("manipulator")
public class Manipulator {
    private String operation;
    private Random random;

    public static Manipulator newManipulator() {
        return new Manipulator();
    }

    @PostConstruct
    private void init() {
        random = new Random();
    }

    public double transform(double value) {
        if (operation.compareTo("ADD") == 0)
            return additive(value);
        else if (operation.compareTo("MULTIPLY") == 0)
            return multiplicative(value);
        return value;
    }

    private double additive(double value) {
        int addition = random.nextInt(2000) - 1000;
        return value + addition;
    }

    private double multiplicative(double value) {
        double multiplier = random.nextDouble() * 2d;
        return value * multiplier;
    }
}