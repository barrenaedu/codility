package codility.lessons;

public class MaxSliceSum {

    public int solutionCubic(int[] arr) {
        int len = arr.length;
        int result = 0;
        for (int p = 0; p < len; p++) {
            for (int q = p; q < len; q++) {
                int sum = 0;
                for (int r = p; r < q + 1; r++) {
                    sum += arr[r];
                }
                result = Math.max(result, sum);
            }
        }
        return result;
    }

    public int solutionQuadratic(int[] arr) {
        int len = arr.length;
        int result = 0;
        for (int p = 0; p < len; p++) {
            int sum = 0;
            for (int q = p; q < len; q++) {
                sum += arr[q];
                result = Math.max(result, sum);
            }
        }
        return result;
    }

    public int solutionLineal(int[] arr) {
        int max_ending = 0;
        int max_slice = 0;
        for (int i = 0; i < arr.length; i++) {
            max_ending = Math.max(0, max_ending + arr[i]);
            max_slice = Math.max(max_slice, max_ending);
        }
        return max_slice;
    }


}
