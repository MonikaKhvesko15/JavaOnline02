package by.epam.student.khvesko.module02.decomposition;

//Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
// (например, 1234, 5789). Для решения задачи использовать декомпозицию.

public class Task15 {
    public static void main(String[] args) {
        int n;
        CorrectEnterFromConsole cons = new CorrectEnterFromConsole();
        n = cons.enterIntFromConsole("n >> ");
        for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++) {
            if (check(i)) {
                System.out.printf(i + " ");
            }
        }
    }

    public static boolean check(int n) {
        int a;
        int b;
        for (int i = n; i > 0; i /= 10) {
            a = i % 10;
            b = (i / 10) % 10;
            if (a != b + 1) {
                return false;
            }
        }
        return true;
    }
}
