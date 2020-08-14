package by.epam.student.khvesko.module02.array;

//9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
// Если таких чисел несколько, то определить наименьшее из них.

import java.util.Arrays;

public class ArrayTask9 {
    public static void main(String[] args) {
        final int N = 30;
        ArrayCreator arr = new ArrayCreator();
        int[] array = arr.CreateIntArray(N);
        System.out.println(Arrays.toString(array));
        int[] addition1 = new int[10];//дополнительный массив из повторяющихся эл-в
        int[] addition2 = new int[10];//дополнительный массив из частот встречаемости повт. эл-в

        int fix = 0;
        int ind = 0;

        for (int i = 0; i < N; i++) {
            fix = array[i];
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (fix == array[j]) {
                    count++;
                }
            }
            if (count > 1) {
                addition1[ind] = fix;
                addition2[ind] = count;
                ind++;
                array[i] = 0;
            }
        }
        System.out.println("Массив повторяющихся элементов:" + Arrays.toString(addition1));
        System.out.println("Массив частот встречаемости повторяющихся элементов:" + Arrays.toString(addition2));
        ////////////////////////////////////////////////
        int maxCount = addition2[0];
        int key = 0;
        //ищем максимальное число встречаемости
        for (int i = 1; i < 10; i++) {
            if (maxCount < addition2[i]) {
                maxCount = addition2[i];
                key = i;
            }
        }
        System.out.println("Максимальное число встречаемости:" + maxCount);
        //////////////////////////////////////////////////
        int min = addition1[key];
        for (int i = key; i < 10; i++) {
            if (addition2[i] == maxCount) {
                if (min > addition1[i]) {
                    min = addition1[i];
                }
            }
        }
        System.out.println("Result=" + min);
    }
}
