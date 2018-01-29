package pl.edu.agh.iet.iosrmanipulation.manipulator;

public class MultiplicativeManipulator extends Manipulator {
    @Override
    public double transform(double value) {
        double multiplier = random.nextDouble() * 2d;
        return value * multiplier;
    }
}