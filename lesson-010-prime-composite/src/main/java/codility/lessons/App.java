package codility.lessons;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private final static Logger LOGGER = LoggerFactory.getLogger(App.class);

    public int divisors(int n) {
        int result = 0;
        int i = 1;
        while (i * i < n) {
          if (n % i == 0) {
              result += 2;
          }
          i++;
        }
        // 0, 1, 4, 9
        if (i * i == n) {
            result++;
        }
        return result;
    }

    public boolean isPrime(int n) {
        int i = 2;
        while (i * i <= n) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    private boolean isPrimeTwo(int nro) {
        boolean isPrime = (nro != 0) && (nro != 1);
        int i = 2;
        while (i * i <= nro && isPrime) {
            isPrime = !(nro % i == 0);
            i++;
        }
        return isPrime;
    }

    public static void main(String[] args) {
        LOGGER.info("Starting app...");
    }

}
