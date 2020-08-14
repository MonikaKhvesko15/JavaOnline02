package by.epam.student.khvesko.module02.decomposition;

import java.util.Scanner;

public class CorrectEnterFromConsole {
    public int enterIntFromConsole(String massage){
        @SuppressWarnings("resourse")
        Scanner sc=new Scanner(System.in);
        System.out.print(massage);
        int value;
        while(!sc.hasNextInt()){
            sc.next();
            System.out.print(massage);
        }
        value= sc.nextInt();
        return value;
    }

    public double enterDoubleFromConsole(String massage){
        @SuppressWarnings("resourse")
        Scanner sc=new Scanner(System.in);
        System.out.print(massage);
        double value;
        while(!sc.hasNextDouble()){
            sc.next();
            System.out.print(massage);
        }
        value= sc.nextDouble();
        return value;
    }
}
