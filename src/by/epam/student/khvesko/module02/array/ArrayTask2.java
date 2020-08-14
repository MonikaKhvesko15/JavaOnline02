package by.epam.student.khvesko.module02.array;

//2. Дана последовательность действительных чисел а1 ,а2 ,..., ап.
// Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter z: ");
        int z = console.nextInt();
        final int N;
        N = 15;
        int count;
        count = 0;
        ArrayCreator arr = new ArrayCreator();
        int[] array = arr.CreateIntArray(N);
        for (int i = 0; i < N; i++) {
            if (array[i] > z) {
                array[i] = z;
                count++;
            }
        }
        System.out.println(Arrays.toString(array) + "\ncount = " + count);
    }
}
