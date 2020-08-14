package by.epam.student.khvesko.module02.array;

//6. Задана последовательность N вещественных чисел.
// Вычислить сумму чисел, порядковые номера которых являются простыми числами.

public class ArrayTask6 {
    public static void main(String[] args) {
        final int N = 30;
        double[] array = new double[N];
        for (int i = 0; i < N; i++) {
            array[i] = (Math.random() * 100) - 50;
        }
        for (int i = 0; i < N; i++) {
            System.out.printf("array[" + i + "]=" + array[i] + "\n");
        }
        ////////////////////////////////////
        double sum = 0;
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    count++;

                }
            }
            if (count == 0) {
                sum += array[i];
                System.out.print(i + " ");//вывод индексов элементов массива, которые являются простыми числами
            }
        }
        System.out.println("\nsum = " + sum);
    }
}
