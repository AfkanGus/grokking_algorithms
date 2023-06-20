
public class BinarySearch {
    public static void main(String[] args) {
        int[] myArray = {87, 21, 45, 93};
        System.out.println(binarySearch(myArray, 23));
        System.out.println(binarySearch(myArray, 12));
    }

    //если значение присутсвует в массиве,то вернуть его его позицию
    public static int binarySearch(int[] array, int item) {
        if (isArrayEmpty(array)) {
            return -1;
        }
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = array[mid];
            if (guessEqualsItem(guess, item)) {
                return mid;
            } else if (guessGreaterThanItem(guess, item)) {
                high = mid - 1;
            } else if (guessLessThanItem(guess, item)) {
               low = mid + 1;
            }
        }
        return -1;
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

    //пустой массив или нет
    public static boolean isArrayEmpty(int[] myArray) {
        int arraySize = myArray.length;
        if (arraySize == 0) {
            return true;
        }
        return false;
    }

    public static boolean guessEqualsItem(int guess, int item) {
        if (guess != item) {
            return false;
        }
        return true;
    }
}
