package codility.lessons;

public class CountDiv {

    public int solution1(int a, int b, int k) {
        if (a % k == 0) {
            return (b / k) - (a / k) + 1;
        } else {
            return (b / k) - (a / k);
        }
    }

    public int solution2(int a, int b, int k) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % k == 0) {
                count++;
            }
        }
        return count;
    }

}
