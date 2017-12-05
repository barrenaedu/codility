package codility.lessons;

public class PermCheck {

    public int solution(int[] a) {
        int MAX_VALUE = 100_000;
        boolean[] ab = new boolean[MAX_VALUE];
        boolean outOfRange = false;
        int i = 0;
        while (i < a.length && !outOfRange) {
            if (a[i] <= MAX_VALUE) {
                ab[a[i] - 1] = true;
            } else {
                outOfRange = true;
            }
            i++;
        }
        i = 0;
        while (!outOfRange && i < MAX_VALUE && ab[i]) {
            i++;
        }
        return !outOfRange && i == a.length ? 1 : 0;
    }

    public int solution2(int[] a) {
        int[] counters = new int[a.length];
        boolean outOfRange = false;
        boolean duplicated = false;
        int i = 0;
        while (i < a.length && !outOfRange && !duplicated) {
            if (a[i] < 1 || a[i] > a.length) {
                outOfRange = true;
            } else if (counters[a[i] - 1] == 1) {
                duplicated = true;
            } else {
                counters[a[i] - 1] = 1;
            }
            i++;
        }
        return !outOfRange && !duplicated ? 1 : 0;
    }

}
