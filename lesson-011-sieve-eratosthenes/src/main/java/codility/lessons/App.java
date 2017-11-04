package codility.lessons;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    /**
     * Prime generator (False: Prime, True: Excluded)
     *
     * @param n
     * @return
     */
    public boolean[] primeArray(int n) {
        boolean[] arr = new boolean[n + 1];
        int i = 2;
        while (i * i <= n) {
            if (!arr[i]) {
                int k = i * i;
                while (k <= n) {
                    arr[k] = true;
                    k += i;
                }
            }
            i++;
        }
        return arr;
    }

    /**
     * Factorizacion (0: Prime, x: Smallest prime divisor)
     *
     * @param n
     * @return
     */
    public int[] FactorizationArray(int n) {
        int[] arr = new int[n + 1];
        int i = 2;
        while (i * i <= n) {
            if (arr[i] == 0) {
                int k = i * i;
                while (k <= n) {
                    if (arr[k] == 0) {
                        arr[k] = i;
                    }
                    k += i;
                }
            }
            i++;
        }
        return arr;
    }

}
