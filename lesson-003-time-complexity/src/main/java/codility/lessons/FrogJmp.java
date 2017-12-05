package codility.lessons;

public class FrogJmp {

    public int solution1(int xi, int xf, int jlen) {
        int jumps = 0;
        int pos = xi;
        for (int i = 0; pos < xf; i++) {
            pos = pos + jlen;
            jumps++;
        }
        return jumps;
    }

    public int solution2(int xi, int xf, int jlen) {
        int jumps = 0;
        for (int now = xi; now < xf; now += jlen) {
            jumps++;
        }
        return jumps;
    }

    public int solution3(int xi, int xf, int jlen) {
        int jumps = (xf - xi) / jlen;
        return (xi + (jumps * jlen) >= xf) ? jumps : jumps + 1;
    }

    public int solution4(int x, int y, int d) {
        return (int) Math.ceil((double)(y - x) / d);
    }

}
