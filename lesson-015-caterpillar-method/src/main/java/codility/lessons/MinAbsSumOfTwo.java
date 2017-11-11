package codility.lessons;

import java.util.Arrays;

public class MinAbsSumOfTwo {

    /**
     * First approach
     *
     * @param arr
     * @return
     */
    public int solution(int[] arr) {
        int len = arr.length;
        if (len <= 0) {
            return 0;
        }
        int head = 0;
        int minGlobal = Math.abs(arr[head] * 2);
        while (head < len) {
            int tail = head;
            int minInternal = minGlobal;
            while (tail < len) {
                int minTmp = Math.abs(arr[head] + arr[tail]);
                if (minTmp < minInternal) {
                    minInternal = minTmp;
                }
                tail++;
            }
            if (minInternal < minGlobal) {
                minGlobal = minInternal;
            }
            head++;
        }
        return minGlobal;
    }

    /**
     * Second approach
     *
     * @param arr
     * @return
     */
    public int solutionImproved(int[] arr) {
        int len = arr.length;
        if (len <= 0) {
            return 0;
        }
        int head = 0;
        int minGlobal = Math.abs(arr[head] * 2);
        while (head < len) {
            int tail = head;
            while (tail < len && Math.abs(arr[head] + arr[tail]) >= minGlobal) {
                tail++;
            }
            if (tail < len) {
                minGlobal = Math.abs(arr[head] + arr[tail]);
            } else if (tail == len) {
                head++;
            }
        }
        return minGlobal;
    }

    /**
     * Best approach, extracted from internet
     *
     * @param arr
     * @return
     */
    public int solutionSorting(int[] arr) {
        int len = arr.length;
        if (len <= 0) {
            return 0;
        }
        Arrays.sort(arr);
        int head = 0;
        int tail = len - 1;
        int min = Math.abs(arr[tail] + arr[head]);
        while (head <= tail) {
            int sum = arr[head] + arr[tail];
            min = Math.min(min, Math.abs(sum));
            if (sum <= 0) {
                head++;
            } else {
                tail--;
            }
        }
        return min;
    }

}