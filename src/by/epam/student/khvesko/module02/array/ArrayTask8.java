package by.epam.student.khvesko.module02.array;

//8. Дана последовательность целых чисел .
// Образовать новую последовательность, выбросив из исходной те члены, которые равны (выражение) .

import java.util.Arrays;

public class ArrayTask8 {
    public static void main(String[] args) {
        final int N = 50;
        ArrayCreator arr = new ArrayCreator();
        int[] array = arr.CreateIntArray(N);
        System.out.println(Arrays.toString(array));
///////////////////////////////////////
        //ПОИСК МИНИМАЛЬНОГО ЭЛЕМЕНТА
        int min = array[0];
        for (int i = 1; i < N; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("min=" + min);
        //////////////////////////////////////
        for (int i = 0; i < N; i++) {
            if (array[i] == min) {
                for (int j = i; j < N - 1; j++) {
                    array[j] = array[j + 1];
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
