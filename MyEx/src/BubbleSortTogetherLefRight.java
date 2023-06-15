public class BubbleSortTogetherLefRight {
    /*
    Теперь проходы происходят одновременно справа налево и слева направо.
     Это позволит элементам "всплывать" как слева, так и справа, обеспечивая более эффективную сортировку.
     */
    public static void main(String[] args) {
        int[] array = new int[]{
                8, 4, 6, 3, 1, 7, 5, 2
        };
        boolean isSorted = false;
        int start = 0;
        int end = array.length - 1;
        while (!isSorted) {
            isSorted = true;
            //справа налево
            for (int i = start; i < end; i++) {
                //если текущий эл. больше следующего
                if (array[i] > array[i + 1]) {
                    // swap принмает массив array и два индекса
                    //и меняет местами эти индексы.
                    swap(array, i, i + 1);
                    isSorted = false;
                }
                //слева направо
                if (array[end - i] < array[end - i - 1]) {
                    swap(array, end - i, end - i - 1);
                    isSorted = false;
                }
            }
            //. После каждой итерации цикла while(когда происходит один проход справа налево
            // и один проход слева направо), правая граница end уменьшается на 1.
            start++;
            end--;
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
                System.out.print(",");
            }
            System.out.print(arr[i]);
        }
    }
}