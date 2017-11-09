package codility.lessons;


public class App {

    /**
     * There are n > 0 canoeists, seat them in the minimum number of double canoes whose displacement (the
     * maximum load) equals k.
     *
     * @param canoeist
     * @param maxWeight
     * @return
     */
    public int greedyCanoeist(int[] canoeist, int maxWeight) {
        int canoes = 0;
        int i = canoeist.length - 1;
        int j = 0;
        while (i >= j) {
            if (canoeist[i] + canoeist[j] <= maxWeight) {
                j++;
            }
            canoes++;
            i--;
        }
        return canoes;
    }

}
