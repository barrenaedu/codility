package codility.lessons;

public class MinAvgTwoSlice {

    public int solution(int[] arr) {
        int minIdx = 0;
        double minValue = Integer.MAX_VALUE;
        double sValue;
        for (int i = 0; i < arr.length - 1; i++) {
            sValue = (arr[i] + arr[i + 1]) / 2.0;
            if (sValue < minValue) {
                minIdx = i;
                minValue = sValue;
            }
            if (i < arr.length - 2) {
                sValue = (arr[i] + arr[i + 1] + arr[i + 2]) / 3.0;
                if (sValue < minValue) {
                    minIdx = i;
                    minValue = sValue;
                }
            }
        }
        return minIdx;
    }

}
