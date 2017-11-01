package codility.lessons;

import java.util.Arrays;

public class Triangle {

    public int solution(int[] arr) {
        Arrays.sort(arr);
        boolean found = false;
        int i = 0;
        while (i < arr.length - 2 && !found) {
            found = (arr[i] >= 0 && arr[i] > arr[i + 2] - arr[i + 1]);
            i++;
        }
        return found ? 1 : 0;
    }

}
