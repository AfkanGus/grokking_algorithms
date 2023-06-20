
/*
Бинарный поиск (Binary Search) - это эффективный алгоритм поиска элемента в
 отсортированном массиве данных. Он основан на принципе "разделяй и властвуй"
  и позволяет находить элемент за логарифмическое время.
 */
public class OtherVersonBinarySearch {
    public static void main(String[] args) {
        //есть отсортированный массив
        int[] arrayBase = {2, 3, 5, 6, 8, 9, 10};
        // найти это число
        int item = 6;
        int rsl = binarSearch(arrayBase, item);
        if (rsl != -1) {
            System.out.println("Элемент " + item + " найден на позиции " + rsl);
        } else {
            System.out.println("Элемент " + item + " не найден");
        }
    }

    public static int binarSearch(int[] array, int item) {
//установим начальные и конечные индексы для текущего массива
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            //mid - средний элемент для тикущего диапазона
            int mid = (low + high) / 2;
            // среднее значение элемента массива
            int midValue = array[mid];
            //сравниваем искомый со средним
            if (midValue == item) {
                //Если они совпадают, поиск успешен, возвращается индекс среднего элемента.
                return mid;
            } else if (midValue < item) {
                //Если искомый элемент больше среднего элемента, поиск продолжается в правой половине диапазона.
                low = mid + 1;
            } else {
                //Если искомый элемент меньше среднего элемента, поиск продолжается в левой половине диапазона.
                high = mid - 1;
            }
        }
        return -1;// искомый элемент не найден.
    }
}
