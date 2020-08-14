package by.epam.student.khvesko.module02.multi;

//2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class ArrayMulti2 {
    public static void main(String[] args) {
        final int M = 5;
        final int N = 5;
        ArrayMultiCreator arr = new ArrayMultiCreator();
        Object object = arr.CreateIntArrayMulti(M, N);
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(" " + ((int[][]) object)[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j)
                    System.out.print(" " + ((int[][]) object)[i][j] + " ");
            }
        }
    }
}
