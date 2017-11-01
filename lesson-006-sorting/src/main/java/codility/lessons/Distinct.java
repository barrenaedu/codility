package codility.lessons;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Distinct {

    public int solutionSort(int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        int ant = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ant) {
                ant = arr[i];
                count++;
            }
        }
        return count;
    }

    public int solutionSet(int[] arr) {
        Arrays.sort(arr);
        Set<Integer> nros = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            nros.add(arr[i]);
        }
        return nros.size();
    }

}
