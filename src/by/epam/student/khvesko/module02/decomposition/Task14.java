package by.epam.student.khvesko.module02.decomposition;

import java.util.ArrayList;

// Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
// возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
// использовать декомпозицию.
public class Task14 {
    public static void main(String[] args) {
        int k;
        CorrectEnterFromConsole cons = new CorrectEnterFromConsole();
        k = cons.enterIntFromConsole("k >> ");
        ArrayList array = new ArrayList();
        for (int i = 1; i < k; i++) {
            int power = numberAmount(i);
            int sum = numberSum(i);
            if (i == Math.pow(sum, power)) {
                array.add(i);
            }
        }
        System.out.println(array);
    }

    public static int numberAmount(int n) {
        int count = 0;
        for (int i = n; i > 0; i /= 10) {
            count++;
        }
        return count;
    }

    public static int numberSum(int n) {
        int sum = 0;
        for (int i = n; i > 0; i /= 10) {
            sum += i % 10;
        }
        return sum;
    }
}
