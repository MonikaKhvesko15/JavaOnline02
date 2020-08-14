package by.epam.student.khvesko.module02.multi;

//10. Найти положительные элементы главной диагонали квадратной матрицы.

public class ArrayMulti10 {
    public static void main(String[] args) {
        final int N = 5;
        ArrayMultiCreator arr = new ArrayMultiCreator();
        Object object = arr.CreateIntArrayMulti(N, N);
        int[][] multi = ((int[][]) object);
        show(multi);
       showMainDiagonal(multi);
    }

    public static void show(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%3d ", array[i][j]);
            }
            System.out.println();
        }
    }

    public static void showMainDiagonal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }

}
