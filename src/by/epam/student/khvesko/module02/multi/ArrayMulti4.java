package by.epam.student.khvesko.module02.multi;

//4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): (формула)

import java.util.Scanner;

public class ArrayMulti4 {
    public static void main(String[] args) {
        final int N;
        Scanner console = new Scanner(System.in);
        System.out.println("Enter N:");
        N = console.nextInt();
        int[][] multi = new int[N][N];
        for (int i = 0; i < N; i += 2) {
            for (int j = 0; j < N; j++) {
                multi[i][j] = j + 1;
            }
        }
        for (int i = 1; i < N; i += 2) {
            for (int j = 0; j < N; j++) {
                multi[i][j] = N - j;
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
