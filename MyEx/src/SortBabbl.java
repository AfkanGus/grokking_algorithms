public class SortBabbl {
    // метод сортировки пузырком
    public static void main(String[] args) {
        int[] array = new int[]{
                3,1,4,2
        };
        //printArray(array);
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                //если правый эл.меньше чем левый
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
            printArray(array);
        }
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
