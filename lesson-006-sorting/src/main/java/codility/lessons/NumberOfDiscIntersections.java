package codility.lessons;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NumberOfDiscIntersections {
    private final static Logger LOGGER = LoggerFactory.getLogger(NumberOfDiscIntersections.class);

    public int solution(int[] arr) {
        return solutionWhile(arr);
    }

    public int solutionWhile(int[] arr) {
        int aLen = arr.length;
        int MAX_COUNT = 10_000_000;
        int count = 0;
        int i = 0;
        while (i < aLen && count <= MAX_COUNT) {
            int e = i + 1;
            while (e < aLen && count <= MAX_COUNT) {
                if ((arr[i] == Integer.MAX_VALUE) || (i + arr[i] >= e - arr[e])) {
                    count++;
                }
                e++;
            }
            i++;
        }
        if (count <= MAX_COUNT) {
            return count;
        }
        return -1;
    }

    public void logIntersections(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int e = 0; e < arr.length; e++) {
                if (i != e) {
                    if (intersec(i, arr[i], e, arr[e])) {
                        LOGGER.info("({},{})", i, e);
                    }
                }
            }
        }
    }

    public boolean intersec(long x1, long r1, long x2, long r2) {
        if (x1 > x2) {
            return x2 + r2 >= x1 - r1;
        } else if (x2 > x1) {
            return x1 + r1 >= x2 - r2;
        }
        return true;
    }


}
