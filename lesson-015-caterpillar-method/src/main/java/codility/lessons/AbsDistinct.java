package codility.lessons;

public class AbsDistinct {

    /**
     * Modified solution extracted from internet
     *
     * @param arr
     * @return
     */
    public int solutionInternet(int[] arr) {
        int len = arr.length;
        if (len <= 0) {
            return 0;
        }
        int head = 0;
        int tail = len - 1;
        int result = 1;
        int currMaxValue = Math.max(Math.abs(arr[head]), Math.abs(arr[tail]));
        if (arr[head] == Integer.MIN_VALUE) {
            currMaxValue = Math.abs(arr[head]);
        }
        while (head <= tail) {
            boolean processed = false;
            int currHead = Math.abs(arr[head]);
            int currTail = Math.abs(arr[tail]);
            // Current value was processed?
            if (currHead == currMaxValue) {
                head++;
                processed = true;
            } else if (currTail == currMaxValue) {
                tail--;
                processed = true;
            }
            // If not processed get a new current maximal value
            if (!processed) {
                if (currHead >= currTail) {
                    currMaxValue = currHead;
                    head++;
                } else {
                    currMaxValue = currTail;
                    tail--;
                }
                result++;
            }
        }
        return result;
    }

}
