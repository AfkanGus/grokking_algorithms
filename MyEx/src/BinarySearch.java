
public class BinarySearch {
    public static void main(String[] args) {
        int[] myList = {87, 21, 45, 93};
        System.out.println(binarySearch(myList, 23));
        System.out.println(binarySearch(myList,12));
    }

    public static int binarySearch(int[] list, int item) {
        if (isListEmpty(list)) {
            return -1;
        }
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];

            if (guessEqualsIsItem(guess, item)) {
                return mid;
            } else if (guessGreaterThanItem(guess, item)) {
                high = mid - 1;
            } else if (guessLessThanItem(guess, item)) {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static boolean isListEmpty(int[] myList) {
        int listSize = myList.length;
        if (listSize == 0) {
            return true;
        }
        return false;

    }

    public static boolean guessEqualsIsItem(int guess, int item) {
        if (guess != item) {
            return false;
        }
        return true;
    }

    public static boolean guessGreaterThanItem(int guess, int item) {
        if (guess < item) {
            return false;
        }
        return true;
    }

    public static boolean guessLessThanItem(int guess, int item) {
        if (guess > item) {
            return false;
        }
        return true;
    }
}
