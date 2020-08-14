package by.epam.student.khvesko.module02.array;

//10. Дан целочисленный массив с количеством элементов п.
// Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
// Примечание. Дополнительный массив не использовать.

import java.util.Arrays;

public class ArrayTask10 {
    public static void main(String[] args) {
        final int N = 30;
        ArrayCreator arr = new ArrayCreator();
        int[] array = arr.CreateIntArray(N);
        System.out.println(Arrays.toString(array));
        for (int i = 1; i < N; i += 2) {
            array[i] = 0;
        }
        System.out.println(Arrays.toString(array));
    }
}
