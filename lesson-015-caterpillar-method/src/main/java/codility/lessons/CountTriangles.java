package codility.lessons;

import java.util.Arrays;

public class CountTriangles {

    /**
     * With sorting, using PARTIAL comparision
     *
     * @param arr
     * @return
     */
    public int solution(int[] arr) {
        int len = arr.length;
        if (len <= 0) {
            return 0;
        }
        int count = 0;
        Arrays.sort(arr);
        for (int p = 0; p < len; p++) {
            int r = p + 2;
            for (int q = p + 1; q < len; q++) {
                while (r < len && arr[p] + arr[q] > arr[r]) {
                    r++;
                }
                count += r - q - 1;
            }
        }
        return count;
    }

    /**
     * Without sorting, using FULL comparision
     *
     * @param arr
     * @return
     */
    public int solutionSlower(int[] arr) {
        int len = arr.length;
        if (len <= 0) {
            return 0;
        }
        int count = 0;
        for (int p = 0; p < len; p++) {
            for (int q = p + 1; q < len; q++) {
                int r = q + 1;
                while (r < len) {
                    if (arr[p] + arr[q] > arr[r] &&
                            arr[q] + arr[r] > arr[p] &&
                            arr[r] + arr[p] > arr[q]) {
                        count++;
                    }
                    r++;
                }
            }
        }
        return count;
    }


}
