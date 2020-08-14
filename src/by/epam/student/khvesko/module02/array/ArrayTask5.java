package by.epam.student.khvesko.module02.array;

//5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

public class ArrayTask5 {
    public static void main(String[] args) {
        final int N = 30;
        ArrayCreator arr = new ArrayCreator();
        int[] array = arr.CreateIntArray(N);
        //ВЫВОД НАЧАЛЬНОГО МАССИВА С ИНДЕКСАЦИЕЙ
        for (int i = 0; i < N; i++) {
            System.out.printf("array[" + i + "]=" + array[i] + "\n");
        }
        // ///////////////////////////////////////
        for (int i = 0; i < N; i++) {
            if (array[i] > i) {
                System.out.printf(array[i] + " ");
            }
        }
    }
}
