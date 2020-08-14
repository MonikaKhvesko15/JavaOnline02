package by.epam.student.khvesko.module02.array;

//3. Дан массив действительных чисел, размерность которого N.
// Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.

import java.util.Arrays;

public class ArrayTask3 {
    public static void main(String[] args) {
        final int N = 30;
        int positive = 0;
        int negative = 0;
        int zero = 0;
        ArrayCreator arr = new ArrayCreator();
        int[] array = arr.CreateIntArray(N);

        for (int i = 0; i < N; i++) {
            if (array[i] > 0) {
                positive++;
            } else if (array[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Positive elements: " + positive);
        System.out.println("Negative elements: " + negative);
        System.out.println("Zero: " + zero);
    }
}
