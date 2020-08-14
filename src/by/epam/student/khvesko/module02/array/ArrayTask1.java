package by.epam.student.khvesko.module02.array;

//1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

import java.util.Scanner;

public class ArrayTask1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter k :");
        int k = console.nextInt();

        ArrayCreator arr = new ArrayCreator();
        final int N;
        N = 10;
        int[] array = arr.CreateIntArray(N);

        int sum;
        sum = 0;
        for (int i = 0; i < N; i++) {
            if (array[i] % k == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}
