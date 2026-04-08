package lab5.advanced;

public abstract class ACalculator {
    //522
    protected Object state;
    public Object result(){
        return state;
    }
    public ACalculator clear(){
        this.init();
        return this;
    }
    protected abstract void init();
}
