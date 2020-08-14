package by.epam.student.khvesko.module02.multi;

//8. В числовой матрице поменять местами два столбца любых столбца,
// т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
// а его элементы второго переместить в первый.
// Номера столбцов вводит пользователь с клавиатуры.

import java.util.Scanner;

public class ArrayMulti8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        final int M = 5;//strings
        final int N = 5;//columns
        ArrayMultiCreator arr = new ArrayMultiCreator();
        Object object = arr.CreateIntArrayMulti(M, N);
        int[][] multi = (int[][]) object;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(" " + multi[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the number of the first column:");
        int col1 = console.nextInt();
        System.out.println("Enter the number of the second column:");
        int col2 = console.nextInt();
        int[] change = new int[N];
        for (int i = 0; i < M; i++) {
            change[i] = multi[i][col1];
            multi[i][col1] = multi[i][col2];
            multi[i][col2] = change[i];
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(" " + multi[i][j] + " ");
            }
            System.out.println();
        }
    }
}
