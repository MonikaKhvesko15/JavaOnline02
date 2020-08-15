package by.epam.student.khvesko.module02.decomposition;

// Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
// Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
public class Task17 {
    public static void main(String[] args) {
        int x;
        CorrectEnterFromConsole cons = new CorrectEnterFromConsole();
        x = cons.enterIntFromConsole("x >> ");
        int count = 0;
        int p=sum(x);
        while(x!=0) {
            x=x-sum(x);
            count++;
        }
        System.out.println(count);
    }

    public static int sum(int n) {
        int sum = 0;
        for (int i = n; i > 0; i /= 10) {
            sum += i % 10;
        }
        return sum;
    }
}
