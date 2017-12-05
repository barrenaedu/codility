package codility.lessons;

public class MissingInteger {

    public int solution(int[] a) {
        boolean[] counters = new boolean[a.length];
        for (int i=0; i < a.length; i++) {
            if (a[i] > 0 && a[i] <= counters.length) {
                counters[a[i]-1] = true;
            }
        }
        int i = 0;
        while (i < counters.length && counters[i]) {
            i++;
        }
        return i + 1;
    }

}
