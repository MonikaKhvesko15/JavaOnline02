package by.epam.student.khvesko.module02.sort;

//Даны дроби
//        Составить программу, которая приводит эти дроби к общему знаменателю и
//        упорядочивает их в порядке возрастания.

import java.util.prefs.NodeChangeEvent;


public class Sort8 {
    public static void main(String[] args) {
        int n = 10;
        Fraction[] mas = new Fraction[n];
        for (int i = 0; i < n; i++) {
            mas[i] = new Fraction();
            mas[i].numerator = (int) (Math.random() * 10 + 1);
            mas[i].denominator = (int) (Math.random() * 10 + 1);
        }

        int denominator = commonDenominator(mas);

        for (int i = 0; i < n; i++) {
            mas[i].numerator *= denominator / mas[i].numerator;
            mas[i].denominator = denominator;
        }
        bubbleSort(mas);
        show(mas);
    }

    public static int commonDenominator(Fraction[] mas) {
        int a = mas[0].denominator;
        int i = 1;
        int temp =-1;
        while (i < mas.length) {
            temp = nod(a, mas[i].denominator);
            a = temp;
            i++;
        }
a=1;
        for (int j = 0; j < mas.length; j++) {
            a*=mas[j].denominator;
        }
        return a / temp;
    }

    public static int nod(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static Fraction[] bubbleSort(Fraction[] mas) {
        boolean flag = false;
        int buf;
        for (int i = 1; i < mas.length; i++) {
            for (int j = 0; j < mas.length - i; j++) {
                if (mas[j].numerator > mas[j + 1].numerator) {
                    buf = mas[j].numerator;
                    mas[j].numerator = mas[j + 1].numerator;
                    mas[j + 1].numerator = buf;
                }
            }
        }
        return mas;
    }

    public static void show(Fraction[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.printf(mas[i].numerator + "/" + mas[i].denominator + " ");
        }
    }
}
