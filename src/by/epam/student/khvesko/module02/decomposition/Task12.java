package by.epam.student.khvesko.module02.decomposition;

import java.util.ArrayList;

//Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
// элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
public class Task12 {
    public static void main(String[] args) {
        int k;
        int n;
        CorrectEnterFromConsole cons = new CorrectEnterFromConsole();
        k = cons.enterIntFromConsole("k >> ");
        n = cons.enterIntFromConsole("n >> ");
        ArrayList array = new ArrayList();
        int elem;
        int index = 0;
        for (int i = 1; i < 50; i++) {
            elem = i;
            if (sumOfNumeral(elem) == k && elem < n) {
                array.add(index, elem);
                index++;
            }
        }
        System.out.println(array);
    }

    public static int sumOfNumeral(int n) {
        int sum = 0;
        for (int i = n; i > 0; i /= 10) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
