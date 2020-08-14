package by.epam.student.khvesko.module02.decomposition;

//. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class Task7 {
    public static void main(String[] args) {
        int a;
        int b=9;
        long sum=0;
        for (a=1; a<=b; a++) {
            if(a%2!=0){
                sum+=fact(a);
                System.out.println("fact "+a+" = "+fact(a));
            }
        }
        System.out.printf("sum  = "+sum);
    }

    public static long fact(int x){
        long result=1;
        while(x>0){
            result*=x;
            x--;
        }
        return result;
    }

}
