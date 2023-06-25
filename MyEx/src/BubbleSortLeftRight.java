public class BubbleSortLeftRight {
    /**
     * Теперь на каждом проходе будет происходить сортировка элементов сначала
     * слева направо, а затем справа налево. Это позволит самому большому элементу
     * "всплывать" справа, а самому маленькому элементу "всплывать" слева.
     * @param args
     */
    public static void main(String[] args) {
        int[] array = new int[]{3, 1, 4, 2};
        printArray(array);
        boolean isSorted = false;
        int start = 0;
        int end = array.length - 1;
        while (!isSorted) {
            isSorted = true;

            // Проход слева направо
            for (int i = start; i < end; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    isSorted = false;
                }
            }
            end--;

            // Проход справа налево
            for (int i = end; i > start; i--) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    isSorted = false;
                }
            }
            start++;

            printArray(array);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printArray(int[] arr) {
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
    }
}
