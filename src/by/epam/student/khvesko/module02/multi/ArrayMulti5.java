package by.epam.student.khvesko.module02.multi;

//5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): (формула)

import java.util.Scanner;

public class ArrayMulti5 {
    public static void main(String[] args) {
        final int N;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter n: ");
        N = console.nextInt();
        int[][] multi = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                multi[i][j] = 0;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = N - 1 - i; j >= 0; j--) {
                multi[i][j] = i + 1;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(" " + multi[i][j] + " ");
            }
            System.out.println();
        }
    }
}
