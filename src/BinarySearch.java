import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
    public int binarySearch(ArrayList<Integer> list, int item) {
        Collections.sort(list);
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = low + high;
            int guess = list.get(mid);

            if(guess == item) {
                return mid;
            } if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
