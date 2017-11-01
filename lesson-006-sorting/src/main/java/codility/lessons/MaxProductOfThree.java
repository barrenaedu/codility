package codility.lessons;

public class MaxProductOfThree {

    public int solution(int[] arr) {
        int[] max = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        int[] min = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        for (int i = 0; i < arr.length; i++) {
            sortMax(arr[i], max);
            sortMin(arr[i], min);
        }
        return Math.max(max[0] * max[1] * max[2], min[0] * min[1] * max[2]);
    }

    private void sortMax(int value, int[] arr) {
        if (value > arr[2]) {
            arr[0] = arr[1];
            arr[1] = arr[2];
            arr[2] = value;
        } else if (value > arr[1]) {
            arr[0] = arr[1];
            arr[1] = value;
        } else if (value > arr[0]) {
            arr[0] = value;
        }
    }

    private void sortMin(int value, int[] arr) {
        if (value < arr[1]) {
            arr[0] = arr[1];
            arr[1] = value;
        } else if (value < arr[0]) {
            arr[0] = value;
        }
    }

}
