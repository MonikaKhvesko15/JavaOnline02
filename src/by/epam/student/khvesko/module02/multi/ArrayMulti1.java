package by.epam.student.khvesko.module02.multi;

//1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class ArrayMulti1 {
    public static void main(String[] args) {
        final int M = 3;
        final int N = 4;
        ArrayMultiCreator arr = new ArrayMultiCreator();
        Object multi = arr.CreateIntArrayMulti(M, N);

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(" " + ((int[][]) multi)[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


        for (int j = 1; j < N; j += 2) {
            if (((int[][]) multi)[0][j] > ((int[][]) multi)[M - 1][j]) {
                for (int i = 0; i < M; i++) {
                    System.out.print(" " + ((int[][]) multi)[i][j] + " ");
                    System.out.println();
                }
                System.out.println("//////////");
            }
        }
    }
}
