package by.epam.student.khvesko.module02.multi;

//11. Матрицу 10x20 заполнить случайными числами от 0 до 15.
// Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.

public class ArrayMulti11 {
    public static void main(String[] args) {
        final int N = 10;
        final int M = 20;
        int[][] multi = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                multi[i][j] = (int) (Math.random() * 16) + 0;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(" " + multi[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Номера строк, где число 5 встречается 3 и более раз:");
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < M; j++) {
                if (multi[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.print(" " + i + " ");
            }
        }
    }
}
