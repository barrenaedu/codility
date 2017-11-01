package codility.lessons;

public class MinPerimeterRectangle {

    public int solutionWhile1(int n) {
        int i = 1;
        int divisor = n;
        int minPer = Integer.MAX_VALUE;
        while (i <= divisor) {
            divisor = n / i;
            if (n % i == 0) {
                minPer = Math.min(minPer, 2 * (divisor + i));
            }
            i++;
        }
        return minPer;
    }

    public int solutionWhile2(int n) {
        int minPer = Integer.MAX_VALUE;
        int i = 1;
        while (i <= n / i) {
            if (n % i == 0) {
                minPer = Math.min(minPer, 2 * (n / i + i));
            }
            i++;
        }
        return minPer;
    }

}
