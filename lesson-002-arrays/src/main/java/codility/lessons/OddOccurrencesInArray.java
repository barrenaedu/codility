package codility.lessons;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {

    public int solution1(int[] arr) {
        Set<Integer> el = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (el.contains(arr[i])) {
                el.remove(arr[i]);
            } else {
                el.add(arr[i]);
            }
        }
        return el.iterator().next();
    }

    public int solution2(int[] arr) {
        return Arrays.stream(arr).reduce((l, r) -> l ^ r).getAsInt();
    }

    public int solution3(int[] arr) {
        Arrays.sort(arr);
        int single = -1;
        int i = 1;
        while (i < arr.length && single == -1) {
            if (arr[i] != arr[i - 1]) {
                single = arr[i - 1];
            }
            i = i + 2;
        }
        if (single == -1) {
            single = arr[arr.length - 1];
        }
        return single;
    }

    public int solution4(int[] arr) {
        int single = 0;
        for (int i = 0; i < arr.length; i++) {
            single = single ^ arr[i];
        }
        return single;
    }

}
