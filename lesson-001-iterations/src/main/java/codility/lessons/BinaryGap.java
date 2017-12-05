package codility.lessons;

public class BinaryGap {

    public int solution1(int nro) {
        int max = 0;
        int count = 0;
        for (char c : Integer.toBinaryString(nro).toCharArray()) {
            if (c == '1') {
                if (count > max) {
                    max = count;
                }
                count = 0;
            } else {
                count++;
            }
        }
        return max;
    }

    public int solution2(int nro) {
        int max = -1;
        int count = 0;
        while (nro > 0) {
            if ((nro & 1) == 1) {
                max = Math.max(max, count);
                count = 0;
            } else {
                if (max > -1) {
                    count++;
                }
            }
            nro = nro >> 1;
        }
        return max == -1 ? 0 : max;
    }

}
