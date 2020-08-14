package by.epam.student.khvesko.module02.decomposition;

// Составить программу, которая в массиве A[N] находит второе по величине число
// (вывести на печать число, которое меньше максимального элемента массива,
// но больше всех других элементов).

import by.epam.student.khvesko.module02.array.ArrayCreator;

public class Task5 {
    public static void main(String[] args) {
        int n;
        CorrectEnterFromConsole cons = new CorrectEnterFromConsole();
        n = cons.enterIntFromConsole("n >> ");
        ArrayCreator arr = new ArrayCreator();
        int[] array = arr.CreateIntArray(n);
        show(array);
        System.out.printf("Result = " + findSecondMax(array));
    }

    public static void show(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("array[" + i + "] = " + array[i]);
            System.out.println();
        }
    }

    public static int findSecondMax(int[] array) {
        int max = array[0];
        int indexMax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
        }
        System.out.printf("First max : array[" + indexMax + "] = " + max);
        System.out.println();
        for (int j = indexMax; j < array.length - 1; j++) {
            array[j] = array[j + 1];
        }
        int result = array[0];
        for (int k = 1; k < array.length; k++) {
            if (array[k] > result) {
                result = array[k];
            }
        }
        return result;
    }
}

