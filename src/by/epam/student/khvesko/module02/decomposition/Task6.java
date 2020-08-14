package by.epam.student.khvesko.module02.decomposition;

//Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми

public class Task6 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        CorrectEnterFromConsole cons = new CorrectEnterFromConsole();
        a = cons.enterIntFromConsole("a >> ");
        b = cons.enterIntFromConsole("b >> ");
        c = cons.enterIntFromConsole("c >> ");
        check(a, b, c);
    }

    public static void check(int a, int b, int c) {
        if (nod(a, b) == 1) {

            if (nod(b, c) == 1) {
                System.out.println("Данные числа являются взаимно простыми");

            } else {
                System.out.println("Данные числа не являются взаимно простыми");
            }

        } else {
            System.out.println("Данные числа не являются взаимно простыми");
        }
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
}
