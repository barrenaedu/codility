package codility.lessons;

import java.util.HashMap;
import java.util.Map;

public class Dominator {

    public int solutionMap(int[] arr) {
        Map<Integer, Integer> me = new HashMap<>();
        int maxIdx = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            Integer el = me.get(arr[i]);
            if (el == null) {
                el = 1;
            } else {
                el++;
            }
            me.put(arr[i], el);
            if (el > maxCount) {
                maxCount = el;
                maxIdx = i;
            }
        }
        return (maxCount == 0) || (maxCount <= arr.length / 2) ? -1 : maxIdx;
    }

    public int solutionQuadratic(int[] arr) {
        int len = arr.length;
        int leader = -1;
        for (int i = 0; i < len; i++) {
            int count = 0;
            for (int e = 0; e < len; e++) {
                if (arr[e] == arr[i]) {
                    count++;
                }
            }
            if (count > len / 2) {
                leader = i;
            }
        }
        return leader;
    }

    public int solutionLineal(int[] arr) {
        int len = arr.length;
        int size = 0;
        int value = 0;
        int idx = 0;
        for (int i = 0; i < len; i++) {
            if (size == 0) {
                size++;
                value = arr[i];
                idx = i;
            } else if (value != arr[i]) {
                size--;
            } else {
                size++;
            }
        }
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] == value) {
                count++;
            }
        }
        return (count > len / 2) ? idx : -1;
    }

}
