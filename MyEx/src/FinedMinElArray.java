public class FinedMinElArray {
    // поиск минимального элемента в массиве
    public static void main(String[] args) {
        int[] minElArray = new int[]{
                45, 12, 34, 67, 54, 34, 1, 2
        };
        //сюда запишем минимальный элемнет. инициализ. его первым эл. массива
        int minValue = minElArray[0];
        // храним номер минимального элемента.
        int minIndex = 0;
// начиная со второго элемента до конца массива.
        for (int i = 1; i < minElArray.length; i++) {
            // если текущий ел.мас. меньше чем то что мы считаем минимальным.
            if (minElArray[i] < minValue) {
                //запоминаем это минимальное зн, как новое новое
                minValue = minElArray[i];
                minIndex = i;
            }

        }
        System.out.println(minValue);
        System.out.println(minIndex);
    }
}
