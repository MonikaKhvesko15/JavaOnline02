package by.epam.student.khvesko.module02.multi;

//6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): (формула)

public class ArrayMulti6 {
    public static void main(String[] args) {
        final int N = 8;
        int[][] multi = new int[N][N];
        //формирование нулевой матрирцы
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                multi[i][j] = 0;
            }
        }
        //трансформация верхней части матрицы
        for (int i = 0; i < N / 2; i++) {
            for (int j = i; j < N - i; j++) {
                multi[i][j] = 1;
            }
        }
        //трансформация нижней части матрицы
        for (int i = N / 2; i < N; i++) {
            for (int j = N - i - 1; j <= i; j++) {
                multi[i][j] = 1;
            }
        }
        //вывод новой матрицы
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(" " + multi[i][j] + " ");
            }
            System.out.println();
        }
    }
}
