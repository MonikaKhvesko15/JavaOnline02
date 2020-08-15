package by.epam.student.khvesko.module02.decomposition;

// Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
// Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
public class Task16 {
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
        for (int i = n; i > 0; i /= 10) {
            if ((i % 10) % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
