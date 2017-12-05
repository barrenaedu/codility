package codility.lessons;

public class PassingCars {
    private static final int MAX_PASS_CARS = 1_000_000_000;

    public int solution1(int[] arr) {
        int cEast = 0;
        int pCars = 0;
        int i = 0;
        while (i < arr.length && pCars <= MAX_PASS_CARS) {
            if (arr[i] == 0) {
                cEast++;
            } else {
                pCars += cEast;
            }
            i++;
        }
        return pCars > MAX_PASS_CARS ? -1 : pCars;
    }

    public int solution2(int[] a) {
        int pCars = 0;
        int countZeros = 0;
        int i = 0;
        while (i < a.length && pCars <= MAX_PASS_CARS) {
            if (a[i] == 1) {
                pCars += countZeros + 1;
            } else if (pCars > 0) {
                countZeros++;
            }
            i++;
        }
        return pCars <= MAX_PASS_CARS ? pCars : -1;
    }

}
