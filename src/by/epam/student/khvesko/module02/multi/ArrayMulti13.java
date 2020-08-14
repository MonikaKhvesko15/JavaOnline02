package by.epam.student.khvesko.module02.multi;

//13. Отсотрировать столбцы матрицы по возрастанию и убыванию значений элементов.

public class ArrayMulti13 {
    public static void main(String[] args) {

        int M = 5;
        int N = 5;
        ArrayMultiCreator arr = new ArrayMultiCreator();
        Object object = arr.CreateIntArrayMulti(M, N);
        int[][] multi = ((int[][]) object);
        show(multi);
        System.out.println();
        int[][] multi1 = sortColumnsInAscendingOrder(multi, N);
        show(multi1);
        System.out.println();
        int[][] multi2 = sortColumnsInDescendingOrder(multi, N);
        show(multi2);

    }

    public static void show(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%3d ", array[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] sortColumnsInAscendingOrder(int[][] array, int N) {
        for (int j = 0; j < N; j++) {
            boolean flag= false;
            int buf;

            while (!flag) {
                flag = true;

                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i][j] > array[i + 1][j]) {
                        flag = false;
                        buf = array[i][j];
                        array[i][j] = array[i + 1][j];
                        array[i + 1][j] = buf;
                    }
                }
            }
        }

        return array;

    }

    public static int[][] sortColumnsInDescendingOrder(int[][] array, int N) {
        for (int j = 0; j < N; j++) {
            boolean flag = false;
            int buf;

            while (!flag) {
                flag = true;

                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i][j] < array[i + 1][j]) {
                        flag = false;
                        buf = array[i][j];
                        array[i][j] = array[i + 1][j];
                        array[i + 1][j] = buf;
                    }
                }
            }
        }

        return array;

    }
}
