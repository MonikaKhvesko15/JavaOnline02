package by.epam.student.khvesko.module02.array;

//4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

import java.util.Arrays;

public class ArrayTask4 {
    public static void main(String[] args) {
        final int N = 20;
        ArrayCreator arr = new ArrayCreator();
        int[] array = arr.CreateIntArray(N);

        //////////////////////////////////////
        //ПОИСК МАКСИМАЛЬНОГО ЭЛЕМЕНТА
        int max = array[0];
        int indmax = 0;
        for (int i = 1; i < N; i++) {
            if (max < array[i]) {
                max = array[i];
                indmax = i;
            }
        }
        ///////////////////////////////////////
        //ПОИСК МИНИМАЛЬНОГО ЭЛЕМЕНТА
        int min = array[0];
        int indmin = 0;
        for (int i = 1; i < N; i++) {
            if (min > array[i]) {
                min = array[i];
                indmin = i;
            }
        }
        //////////////////////////////////////
        System.out.println(Arrays.toString(array));
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        int change = array[indmax];
        array[indmax] = array[indmin];
        array[indmin] = change;
        System.out.println(Arrays.toString(array));
    }
}
