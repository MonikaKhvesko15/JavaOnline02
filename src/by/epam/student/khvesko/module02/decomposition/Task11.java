package by.epam.student.khvesko.module02.decomposition;

//Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр
public class Task11 {
    public static void main(String[] args) {
        int a;
        int b;
        CorrectEnterFromConsole cons = new CorrectEnterFromConsole();
        a = cons.enterIntFromConsole("a >> ");
        b = cons.enterIntFromConsole("b >> ");
        int count1 = 0;
        int count2 = 0;
        for (int i = a; i > 0; i /= 10) {
            count1++;
        }
        for (int i = b; i > 0; i /= 10) {
            count2++;
        }
        if (count1 > count2) {
            System.out.println("В числе " + a + " больше цифр, чем в числе " + b);
        } else if (count1 < count2) {
            System.out.println("В числе " + b + " больше цифр, чем в числе " + a);
        } else {
            System.out.println("Количество цифр в двух числах одинаково");
        }
    }
}
