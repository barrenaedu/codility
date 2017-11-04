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
                end  = mid - 1;
            }
        }
        return arr[index] == nro ? index : -1;
    }

}
