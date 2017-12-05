package codility.lessons;

public class TapeEquilibrium {

    /**
     * Codeada por mi
     */
    public int solution1(int[] arr) {
        int min = Integer.MAX_VALUE;
        int[] sLow = new int[arr.length - 1];
        int[] sHigh = new int[arr.length - 1];
        sLow[0] = arr[0];
        sHigh[0] = arr[arr.length - 1];
        for (int i = 1; i < arr.length - 1; i++) {
            sLow[i] = sLow[i - 1] + arr[i];
            sHigh[i] = sHigh[i - 1] + arr[arr.length - i - 1];
        }
        int abs;
        for (int i = 0; i < sLow.length; i++) {
            abs = Math.abs(sLow[i] - sHigh[sLow.length - i - 1]);
            if (abs < min) {
                min = abs;
            }
        }
        return min;
    }

    /**
     * Bajada de internet
     */
    public int solution2(int[] arr) {
        int sumRight = 0;
        for (int i = 0; i < arr.length; i++) {
            sumRight += arr[i];
        }
        int minDiff = Integer.MAX_VALUE;
        int sumLeft = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sumLeft += arr[i];
            sumRight -= arr[i];
            minDiff = Math.min(minDiff, Math.abs(sumLeft - sumRight));
        }
        return minDiff;
    }

}
