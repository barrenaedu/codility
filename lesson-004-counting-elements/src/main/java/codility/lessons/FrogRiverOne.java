package codility.lessons;

public class FrogRiverOne {

    public int solution1(int x, int[] arr) {
        int[] leaves = new int[x];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - 1 < x && leaves[arr[i] - 1] == 0) {
                leaves[arr[i] - 1] = i + 1;
            }
        }
        int i = 0;
        int max = -1;
        while (i < leaves.length && leaves[i] != 0) {
            if (leaves[i] > max) {
                max = leaves[i] - 1;
            }
            i++;
        }
        return i == leaves.length ? max : -1;
    }

}
