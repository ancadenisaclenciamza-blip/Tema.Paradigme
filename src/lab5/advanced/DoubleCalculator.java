package lab5.advanced;

public class DoubleCalculator extends ACalculator {

    public DoubleCalculator(Double initialValue) {
        this.state = initialValue;
    }

    @Override
    protected void init() {
        this.state = 0.0;
    }

    public DoubleCalculator add(Double value) {
        this.state = (Double) this.state + value;
        return this;
    }

    public DoubleCalculator subtract(Double value) {
        this.state = (Double) this.state - value;
        return this;
    }

    public DoubleCalculator multiply(Double value) {
        this.state = (Double) this.state * value;
        return this;
    }
}
