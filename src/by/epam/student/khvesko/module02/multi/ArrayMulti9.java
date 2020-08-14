package by.epam.student.khvesko.module02.multi;

//9. Задана матрица неотрицательных чисел.
// Посчитать сумму элементов в каждом столбце.
// Определить, какой столбец содержит максимальную сумму.

import java.util.Arrays;

public class ArrayMulti9 {
    public static void main(String[] args) {
        final int M = 5;
        final int N = 7;
        int[][] multi = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                multi[i][j] = (int) (Math.random() * 9) + 1;
                System.out.print(" " + multi[i][j] + " ");
            }
            System.out.println();
        }
        int[] sum = new int[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sum[i] += multi[j][i];
            }
        }
        System.out.print(Arrays.toString(sum));
        int max = sum[0];
        int ind = 0;
        for (int i = 1; i < N; i++) {
            if (max < sum[i]) {
                max = sum[i];
                ind = i;
            }
        }
        System.out.println();
        System.out.println("Столбец " + ind + " содержит максимальную сумму элементов: " + max);
    }
}
