package codility.lessons;

public class MaxCounters {

    public int[] solution(int n, int[] arr) {
        int[] counters = new int[n];
        int lmc = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > n) {
                // Maxcounters
                lmc = max;
            } else {
                // Increase
                if (counters[arr[i]-1] < lmc) {
                    counters[arr[i]-1] = lmc + 1;
                } else {
                    counters[arr[i]-1]++;
                }
                if (counters[arr[i]-1] > max) {
                    max = counters[arr[i]-1];
                }
            }
        }
        for (int i=0; i < counters.length; i++) {
            if (counters[i] < lmc) {
                counters[i] = lmc;
            }
        }
        return counters;
    }

}
