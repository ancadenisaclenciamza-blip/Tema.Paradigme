package lab7;

public class PasswordMaker {
   //b
   private static final PasswordMaker instance = new PasswordMaker();
    private static int callingCount = 0;

    private PasswordMaker() {
    }
    public static PasswordMaker getInstance() {
        callingCount++;
        return instance;
    }
    public static int getCallingCounts() {
        return callingCount;
    }
}
