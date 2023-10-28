import java.math.BigInteger;

public class Task148 {

    public static void main(String[] args) {
        System.out.println(factorial(6));
    }

    public static BigInteger factorial(int value) {
        if (value <= 1) {
            return BigInteger.valueOf(1);
        } else {
            return BigInteger.valueOf(value * (value - 1));

        }
    }
}


