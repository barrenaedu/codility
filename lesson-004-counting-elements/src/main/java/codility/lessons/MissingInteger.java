package codility.lessons;

public class MissingInteger {

    public int solution(int[] arr) {
        boolean[] setPos = new boolean[1000000+1];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                setPos[arr[i]] = true;
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
        }
        int i = 1;
        while (i <= max && setPos[i]) {
            i++;
        }
        return i;
    }

}
