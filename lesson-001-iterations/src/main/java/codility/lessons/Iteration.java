package codility.lessons;

public class Iteration {

    public int[] interation1(int n) {
        int[] out = new int[n];
        for (int i = 0; i < n; i++) {
            out[i] = i;
        }
        return out;
    }

    public int[] interation1Vis(int n) {
        int[] out = new int[n];
        for (int i = 0; i < n; ++i) {
            out[i] = i;
        }
        return out;
    }

    public int[] interation2(int n) {
        int[] out = new int[n];
        int e = 0;
        for (int i = 0; i < n; i++) {
            out[i] = e++;
        }
        return out;
    }

    public int[] interation2Vis(int n) {
        int[] out = new int[n];
        int e = 0;
        for (int i = 0; i < n; i++) {
            out[i] = ++e;
        }
        return out;
    }

}
