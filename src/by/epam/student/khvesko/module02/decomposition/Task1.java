package by.epam.student.khvesko.module02.decomposition;

// Написать метод(методы) для нахождения наибольшего общего делителя и
// наименьшего общего кратного двух натуральных чисел

public class Task1 {
    public static void main(String[] args) {
        int a;
        int b;
        CorrectEnterFromConsole cons = new CorrectEnterFromConsole();
        a = cons.enterIntFromConsole("a >> ");
        b = cons.enterIntFromConsole("b >> ");
        System.out.printf("NOD = " + nod(a, b));
        System.out.println();
        System.out.printf("NOK = " + nok(a, b));
    }

    public static int nod(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        return a + b;
    }

    public static int nok(int a, int b) {
        a = (a * b) / nod(a, b);
        return a;
    }
}
