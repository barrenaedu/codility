package codility.lessons;

public class MaxNonoverlappingSegments {

    public int solution(int[] A, int[] B) {
        int len = A.length;
        if (len < 2) {
            return len;
        }
        int count = 1;
        int end = B[0];
        int index = 1;
        while (index < len) {
            while (index < len && A[index] <= end) {
                index++;
            }
            if (index < len) {
                count++;
                end = B[index];
            }
        }
        return count;
    }

}
