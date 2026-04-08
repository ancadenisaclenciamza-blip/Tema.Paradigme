package lab5.advanced;

public class Lab5Adv {
    public static void main(String[] args) {
        // pt int(10 + 5 - 3) * 2
        NewIntCalculator iCalc = new NewIntCalculator(10);
        int resInt = (Integer) iCalc.add(5).subtract(3).multiply(2).result();
        System.out.println("5.5.2 a) " + resInt);

        // pt double(10 + 5 - 3.3) * 2.2
        DoubleCalculator dCalc = new DoubleCalculator(10.0);
        double resDouble = (Double) dCalc.add(5.0).subtract(3.3).multiply(2.2).result();
        System.out.println("5.5.2 b) " + resDouble);
    }
}
