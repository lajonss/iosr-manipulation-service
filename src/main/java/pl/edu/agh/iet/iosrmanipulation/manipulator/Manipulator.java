package pl.edu.agh.iet.iosrmanipulation.manipulator;

import java.util.Random;

public class Manipulator {
    protected Random random = new Random();

    public double transform(double value) {
        return value + 1;
    }
}