package codility.lessons;

public class TieRopes {

    public int solution(int k, int[] arr) {
        int len = arr.length;
        int i = 0;
        int j = 0;
        int count = 0;
        while (j < len) {
            int sum = 0;
            i = j;
            while (sum < k && i < len) {
                sum += arr[i];
                i++;
            }
            if (sum >= k) {
                count++;
            }
            j = i;
        }
        return count;
    }

}
