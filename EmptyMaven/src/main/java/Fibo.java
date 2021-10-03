import com.google.gson.Gson;

import java.math.BigInteger;

public class Fibo {

    public static BigInteger fibonacci(int n) {
        BigInteger prev = BigInteger.ONE;
        BigInteger fibo = BigInteger.ZERO;
        for (int i = 0; i < n; i++) {
            BigInteger temp = prev;
            prev = fibo;
            fibo = fibo.add(temp);
        }
        return fibo;
    }

    public static void main(String[] args) {
        fibonacci(16);
        Gson gson = new Gson();
    }
}
