package by.epam.student.khvesko.module02.decomposition;

//. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
// Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
// Для решения задачи использовать декомпозицию.
public class Task13 {
    private static Object Exception;

    public static void main(String[] args) {
        int n;
        CorrectEnterFromConsole cons = new CorrectEnterFromConsole();
        n = cons.enterIntFromConsole("n >> ");
        if (check(n)) {
            return;
        }
        for (int i = n; i < 2 * n; i++) {
            int a = i;
            int b = i + 2;
            if (simpleNumber(a) && simpleNumber(b)) {
                System.out.println("[ " + a + ", " + b + " ]");
            }
        }
    }

    public static boolean check(int n) {
        if (n <= 2) {
            System.out.println("Number cannot be less than 2");
            return true;
        }
        return false;
    }

    public static boolean simpleNumber(int n) {
        int count = 0;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }
}
