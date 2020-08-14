package by.epam.student.khvesko.module02.array;

//7. Даны действительные числа...  Найти (выражение)
public class ArrayTask7 {
    public static void main(String[] args) {
        final int N = 40;
        ArrayCreator arr = new ArrayCreator();
        int[] array = arr.CreateIntArray(N);
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                array[i] = (int) (array[i] + array[N - 1]);
            } else {
                array[i] = (int) (array[i] + array[N - 2]);
            }
        }
        int max = array[0];
        for (int i = 0; i < N; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
