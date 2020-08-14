package by.epam.student.khvesko.module02.multi;

//12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

public class ArrayMulti12 {
    public static void main(String[] args) {
        int M = 5;
        int N = 5;
        ArrayMultiCreator arr = new ArrayMultiCreator();
        Object object = arr.CreateIntArrayMulti(M, N);
        int[][] multi = ((int[][]) object);
        show(multi);
        System.out.println();
        int[][] multi1 = sortArrayInAscendingOrder(multi);
        show(multi1);
        System.out.println();
        int[][] multi2 = sortArrayInDescendingOrder(multi);
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

    public static int[][] sortArrayInAscendingOrder(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            boolean flag = false;
            int buf;
            while (!flag) {
                flag = true;

                for (int j = 0; j < array[i].length - 1; j++) {
                    if (array[i][j] > array[i][j + 1]) {
                        flag = false;
                        buf = array[i][j];
                        array[i][j] = array[i][j + 1];
                        array[i][j + 1] = buf;
                    }
                }
            }
        }

        return array;
    }

    public static int[][] sortArrayInDescendingOrder(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            boolean flag = false;
            int buf;

            while (!flag) {
                flag = true;

                for (int j = 0; j < array[i].length - 1; j++) {
                    if (array[i][j] < array[i][j + 1]) {
                        flag = false;
                        buf = array[i][j];
                        array[i][j] = array[i][j + 1];
                        array[i][j + 1] = buf;
                    }
                }
            }
        }

        return array;
    }
}

