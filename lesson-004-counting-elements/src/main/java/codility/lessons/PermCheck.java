package codility.lessons;

import java.util.Arrays;

public class PermCheck {

    public int solution(int[] arr) {
        Arrays.sort(arr);
        int i = 0;
        boolean fine = true;
        while (i < arr.length - 1 && fine) {
            fine = arr[i] + 1 == arr[i + 1];
            i++;
        }
        if (i == arr.length - 1 && fine && arr[0] == 1) {
            return 1;
        } else {
            return 0;
        }
    }

}
