package lab5.advanced;

import lab5.AdvancedCalculator;
public class NewIntCalculator extends ACalculator {

    public NewIntCalculator(Integer initialValue) {
        this.state = initialValue;
    }

    @Override
    protected void init() {
        this.state = 0;
    }

    public NewIntCalculator add(Integer value) {
        this.state = (Integer) this.state + value;
        return this;
    }

    public NewIntCalculator subtract(Integer value) {
        this.state = (Integer) this.state - value;
        return this;
    }

    public NewIntCalculator multiply(Integer value) {
        this.state = (Integer) this.state * value;
        return this;
    }
}