package by.epam.student.khvesko.module02.multi;

//3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

import java.util.Scanner;

public class ArrayMulti3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        final int M = 10;
        final int N = 10;
        ArrayMultiCreator arr = new ArrayMultiCreator();
        Object object = arr.CreateIntArrayMulti(M, N);
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(" " + ((int[][]) object)[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Enter the string k: ");
        int k = console.nextInt();
        System.out.print("Enter the column p: ");
        int p = console.nextInt();
        System.out.println("////////////////////////////////////////");
        //ВЫВОД СТРОКИ K
        for (int i = 0; i < N; i++) {
            System.out.print(" " + ((int[][]) object)[k][i] + " ");
        }
        System.out.println();
        System.out.println("///////////////////////////////////////");
        //ВЫВОД СТОЛБЦА P
        for (int i = 0; i < M; i++) {
            System.out.print(((int[][]) object)[i][p]);
            System.out.println();
        }
    }
}
