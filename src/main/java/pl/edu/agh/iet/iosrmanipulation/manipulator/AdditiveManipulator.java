package pl.edu.agh.iet.iosrmanipulation.manipulator;

public class AdditiveManipulator extends Manipulator {
    @Override
    public double transform(double value) {
        int addition = random.nextInt(2000) - 1000;
        return value + addition;
    }
}