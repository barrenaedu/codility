package codility.lessons;

public class App {

    public int binarySearch(int[] arr, int nro) {
        if (arr.length == 0) {
            return -1;
        }
        int beg = 0;
        int end = arr.length - 1;
        int mid = 0;
        int index = 0;
        while (beg <= end) {
            mid = (beg + end) / 2;
            if (arr[mid] <= nro) {
                beg = mid + 1;
                index = mid;
            } else {
                end = mid - 1;
            }
        }
        return arr[index] == nro ? index : -1;
    }

    /**
     * Returns index if found, -1 otherwise
     *
     * @param arr
     * @param nro
     * @return
     */
    public int binarySearchVariation(int[] arr, int nro) {
        int len = arr.length;
        int begin = 0;
        int end = len - 1;
        int index = -1;
        while (begin <= end && index == -1) {
            int middle = (begin + end) / 2;
            if (nro < arr[middle]) {
                end = middle - 1;
            } else if (nro > arr[middle]) {
                begin = middle + 1;
            } else {
                index = middle;
            }
        }
        return index;
    }

}
