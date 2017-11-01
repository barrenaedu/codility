package codility.lessons;

public class CyclicRotation {

    public int[] solution(int[] arr, int k) {
        int len = arr.length;
        if (k == 0 || len == 0 || k == len) {
            return arr;
        }
        k = k % len;
        int[] out = new int[len];
        for (int i = 0; i < k; i++) {
            out[i] = arr[len - k + i];
        }
        for (int i = 0; i < len - k; i++) {
            out[i + k] = arr[i];
        }
        return out;
    }

}
