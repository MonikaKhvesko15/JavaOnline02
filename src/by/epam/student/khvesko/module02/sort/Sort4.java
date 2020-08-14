package by.epam.student.khvesko.module02.sort;

//4.Сортировка обменами.
// Дана последовательность чисел a1,a2...an
// Требуется переставить числа в порядке возрастания.
// Для этого сравниваются два соседних числа ai и ai+1.
// Если ai > ai+1, то делается перестановка.
// Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
// Составить алгоритм сортировки, подсчитывая при этом количества перестановок.

import by.epam.student.khvesko.module02.array.ArrayCreator;

public class Sort4 {
    public static void main(String[] args) {
        int m = (int) (Math.random() * 20 + 1);
        ArrayCreator arr = new ArrayCreator();
        int[] array1 = arr.CreateIntArray(m);
        swapSort(array1);
        show(array1);
    }
    public static void show(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i]+" ");
        }
    }

    public static void swapSort(int[] array) {
        int count = 0;
        int temp = 0;
        boolean flag = true;

        while (flag) {
            flag = false;

            for (int i = 1; i < array.length; i++) {

                if (array[i] < array[i - 1]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    count++;
                    flag = true;
                }
            }
        }
        System.out.println("Количество перестановок: " + count);
        System.out.println();

    }
}
