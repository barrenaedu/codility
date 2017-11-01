package codility.lessons;

import java.util.Arrays;

public class PermMissingElem {

    public int solution1(int[] arr) {
        if (arr.length > 0) {
            Arrays.sort(arr);
            int i = 0;
            boolean fine = true;
            while ((i < arr.length - 1) && fine) {
                fine = (arr[i + 1] - arr[i] == 1);
                i++;
            }
            if (arr.length == 1) {
                if (arr[0] > 1) {
                    // {2} > 1
                    return 1;
                } else {
                    // {1} > 2
                    return 2;
                }
            } else if (arr[0] > 1) {
                // {2,3} > 1
                return 1;
            } else if ((i == arr.length - 1) && fine) {
                // {1,2,3} > 4
                return arr[arr.length - 1] + 1;
            } else {
                // fin
                return arr[i - 1] + 1;
            }
        } else {
            return 1;
        }
    }

    public int solution2(int[] arr) {
        int sum = arr.length + 1;
        int i;
        for (i = 0; i < arr.length; ++i) {
            sum += (i + 1) - arr[i];
        }
        return sum;
    }

    public int solution3(int[] arr) {
        int natsum = 0, givsum = 0;
        int i;
        for (i = 1; i <= arr.length + 1; ++i) {
            natsum += i;
        }
        for (i = 0; i < arr.length; ++i) {
            givsum += arr[i];
        }
        return natsum - givsum;
    }

}
