package codility.lessons;

public class CountFactors {

    public int solution(int n) {
        int result = 0;
        long i = 1;
        while (i * i < n) {
            if (n % i == 0) {
                result += 2;
            }
            i++;
        }
        if (i * i == n) {
            result++;
        }
        return result;
    }

}
