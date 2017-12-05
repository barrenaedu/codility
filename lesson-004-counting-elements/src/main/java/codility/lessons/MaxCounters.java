package codility.lessons;

public class MaxCounters {

    public int[] solutionLineal(int n, int[] arr) {
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
                max = Math.max(max, counters[arr[i]-1]);
            }
        }
        for (int i=0; i < counters.length; i++) {
            if (counters[i] < lmc) {
                counters[i] = lmc;
            }
        }
        return counters;
    }

    public int[] solutionLineal2(int n, int[] a) {
        int[] counters = new int[n];
        int max = 0;
        int lastMax = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= n) {
                // Increase single counter
                if (counters[a[i] - 1] < lastMax) {
                    counters[a[i] - 1] = lastMax;
                }
                counters[a[i] - 1]++;
                max = Math.max(max, counters[a[i] - 1]);
            } else {
                // Increase all
                lastMax = max;
            }
        }
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] < lastMax) {
                counters[i] = lastMax;
            }
        }
        return counters;
    }

    public int[] solutionQuadratic(int n, int[] a) {
        int[] counters = new int[n];
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= n) {
                // Increase 'counters[a[i]-1]' counter
                counters[a[i]-1]++;
                max = Math.max(max, counters[a[i]-1]);
            } else {
                // Increase all
                for (int e = 0; e < counters.length; e++) {
                    counters[e] = max;
                }
            }
        }
        return counters;
    }

}
