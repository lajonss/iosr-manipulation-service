package pl.edu.agh.iet.iosrmanipulation.manipulator;

import java.util.Random;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "manipulator")
public class Manipulator {
    private static String operation;
    protected Random random = new Random();

    public static Manipulator newManipulator() {
        if (operation.compareTo("ADD") == 0)
            return new AdditiveManipulator();
        else if (operation.compareTo("MULTIPLY") == 0)
            return new MultiplicativeManipulator();
        return new Manipulator();
    }

    public double transform(double value) {
        return value + 1;
    }
}