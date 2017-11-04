package codility.lessons;

public class App {

    public int gcd(int a, int b) {
        if (a == b) {
            return a;
        } else if (a > b) {
            return gcd(a - b, b);
        } else {
            return gcd(a, b - a);
        }
    }

    public int gcdMod(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            return gcdMod(b, a % b);
        }
    }

}
