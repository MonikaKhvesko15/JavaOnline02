package by.epam.student.khvesko.module02.decomposition;

// Дано натуральное число N. Написать метод(методы) для формирования массива,
// элементами которого являются цифры числа N.

import java.util.ArrayList;

public class Task10 {
    public static void main(String[] args) {
        CorrectEnterFromConsole cons = new CorrectEnterFromConsole();
        int n = cons.enterIntFromConsole("n >> ");
        ArrayList array = new ArrayList();
        for (int i = n, j = 0; i > 0; i /= 10, j++) {
            array.add(j, n % 10);
            n /= 10;
        }
        System.out.println(array);
    }
}
