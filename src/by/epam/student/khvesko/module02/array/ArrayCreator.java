package by.epam.student.khvesko.module02.array;

public class ArrayCreator {
    public int[] CreateIntArray(final int size) {
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 100) - 50;
        }
        return arr;
    }
}
