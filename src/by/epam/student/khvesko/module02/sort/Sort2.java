package by.epam.student.khvesko.module02.sort;

//2. Даны две последовательности
//. Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.

import by.epam.student.khvesko.module02.array.ArrayCreator;

public class Sort2 {
    public static void main(String[] args) {
        int m = (int) (Math.random() * 10 + 2);
        int n = (int) (Math.random() * 10 + 2);
        ArrayCreator arr = new ArrayCreator();
        int[] array1 = arr.CreateIntArray(m);
        bubbleSort(array1);
        show(array1);
        System.out.println();
        int[] array2 = arr.CreateIntArray(n);
        bubbleSort(array2);
        show(array2);
        System.out.println();
        show(bubbleSort(unionArr(array1,array2)));
    }

    public static int[] bubbleSort(int[] array) {
        boolean flag = false;
        int buf;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    buf = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buf;
                }
            }
        }
        return array;
    }

    public static void show(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i]+" ");
        }
    }

    public static int[] unionArr(int[] array1, int[] array2){
        int size=array1.length+array2.length;
        int[] array=new int[size];
        for (int i = 0; i < size; i++) {
            if (i <= array1.length - 1) {
                array[i] = array1[i];
            }
            if (i > array1.length-1 && i < size) {
                array[i] = array2[i - array1.length];
            }
        }
        return array;
    }
}
