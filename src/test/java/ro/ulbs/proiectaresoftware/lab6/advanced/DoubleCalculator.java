package test.java.ro.ulbs.proiectaresoftware.lab6.advanced;
//exercitii lab6
public class DoubleCalculator {
    private double state;

    public DoubleCalculator init() {
        this.state = 0.0;
        return this;
    }

    public DoubleCalculator add(double v) {
        this.state += v;
        return this;
    }

    public double getState() {
        return this.state;
    }
}