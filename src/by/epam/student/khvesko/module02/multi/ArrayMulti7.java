package by.epam.student.khvesko.module02.multi;

//7. Сформировать квадратную матрицу порядка N по правилу:  (формула)
//и подсчитать количество положительных элементов в ней.

public class ArrayMulti7 {
    public static void main(String[] args) {
        final int N = 9;
        double[][] multi = new double[N][N];
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                multi[i][j] = Math.sin((double) ((Math.pow((double) i, 2) - Math.pow((double) j, 2)) / N));
                if (multi[i][j] > 0) {
                    count++;
                }
            }
        }
        System.out.println("Positive elements:" + count);
    }
}
