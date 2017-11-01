package codility.lessons;

public class PassingCars {

    public int solution(int[] arr) {
        int cEast = 0;
        int pCars = 0;
        int i = 0;
        while (i < arr.length && pCars <= 1000000000) {
            if (arr[i] == 0) {
                cEast++;
            } else {
                pCars += cEast;
            }
            i++;
        }
        return pCars > 1000000000 ? -1 : pCars;
    }

}
