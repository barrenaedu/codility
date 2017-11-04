package codility.lessons;

public class App {

    /**
     * Fibonacci serie (Recursive solution)
     *
     * @param n
     * @return
     */
    public int[] fibonacciRecursive(int n) {
        if (n == 0) {
            return null;
        }
        int[] arr = new int[n];
        fibonacciRecursiveHelper(arr, n);
        return arr;
    }

    private void fibonacciRecursiveHelper(int[] serie, int n) {
        if (n <= 2) {
            serie[n - 1] = n - 1;
        } else {
            fibonacciRecursiveHelper(serie, n - 2);
            fibonacciRecursiveHelper(serie, n - 1);
            serie[n - 1] = serie[n - 3] + serie[n - 2];
        }
    }

    /**
     * Fibonacci serie (Iterative solution)
     *
     * @param n
     * @return
     */
    public int[] fibonacciIterative(int n) {
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-2] + arr[i-1];
        }
        return arr;
    }

}
