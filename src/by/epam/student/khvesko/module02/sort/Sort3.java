package by.epam.student.khvesko.module02.sort;

//3. Сортировка выбором. Дана последовательность чисел .
// Требуется переставить элементы так, чтобы они были расположены по убыванию.
// Для этого в массиве, начиная с первого, выбирается наибольший элемент и ставится на первое место,
// а первый - на место наибольшего. Затем, начиная со второго, эта процедура повторяется.
// Написать алгоритм сортировки выбором.

import by.epam.student.khvesko.module02.array.ArrayCreator;

public class Sort3 {
    public static void main(String[] args) {
        int m = (int) (Math.random() * 20 + 1);
        ArrayCreator arr = new ArrayCreator();
        int[] array1 = arr.CreateIntArray(m);
        selectionSort(array1);
        show(array1);

    }
    public static void show(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i]+" ");
        }
    }

    public static void selectionSort(int[] array){
        for (int i = 0; i < array.length; i++) {

            int max = array[i];
            int maxIndex = i;

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] > max) {
                    max = array[j];
                    maxIndex = j;
                }
            }

            if (i != maxIndex) {
                int tmp = array[i];
                array[i] = array[maxIndex];
                array[maxIndex] = tmp;
            }
        }
    }
}
