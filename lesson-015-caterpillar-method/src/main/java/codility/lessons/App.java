package codility.lessons;

public class App {

    /**
     * Let’s check whether a sequence contains a contiguous subse-quence whose sum of elements equals s.
     * For example, in the following sequence we are looking for a subsequence whose total equals s = 12.
     *
     * @param arr
     * @param sum
     */
    public boolean caterpillarMethod(int[] arr, int sum) {
        int len = arr.length;
        int front = 0;
        int total = 0;
        for (int back = 0; back < len; back++) {
            while (front < len && total + arr[front] <= sum) {
                total += arr[front];
                front++;
            }
            if (total == sum) {
                return true;
            }
            total -= arr[back];
        }
        return false;
    }

}
