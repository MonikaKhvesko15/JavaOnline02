package by.epam.student.khvesko.module02.decomposition;

//Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел

public class Task2 {
    public static void main(String[] args) {
        int n=4;
        int a;
        int b;
        int c;
        int d;
        CorrectEnterFromConsole enter=new CorrectEnterFromConsole();
        a=enter.enterIntFromConsole("a >> ");
        b= enter.enterIntFromConsole("b >> ");
        c=enter.enterIntFromConsole("c >> ");
        d=enter.enterIntFromConsole("d >> ");
        int temp;
            temp = nod(a,b );
            a = temp;
            temp=nod(a,c);
            a=temp;
            temp=nod(a,d);
        System.out.printf("NOD = "+ temp);

        }

    public static int nod(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
