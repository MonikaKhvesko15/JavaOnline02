package by.epam.student.khvesko.module02.multi;

//14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
// причем в каждом столбце число единиц равно номеру столбца.

public class ArrayMulti14 {
    public static void main(String[] args) {

        int m = (int) (Math.random() * 10 + 1);
        int n = (int) (Math.random() * 10 + 1);

        int[][] mass = createArray(m, n);
        show(mass);;

    }

    public static int[][] createArray(int m, int n) {

        int[][] array = new int[m][n];

        if (m < n) {
            System.out.println("Сгенерирована матрица размером " + m + " на " + n + "."
                    + " На матрице данных размеров не выполнимо условие задачи ");

        } else {

            for (int j = 1; j < n; j++) {

                for (int i = 0; i < j + 1; i++) {
                    array[i][j] = 1;
                }
            }
        }

        return array;
    }

    public static void show(int[][] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%3d ", array[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
