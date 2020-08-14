package by.epam.student.khvesko.module02.decomposition;

// На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие,
// между какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив

import by.epam.student.khvesko.module02.sort.Fraction;

public class Task4 {
    public static void main(String[] args) {
        int n;
        CorrectEnterFromConsole cons = new CorrectEnterFromConsole();
        n = cons.enterIntFromConsole("n >> ");
        Point[] mas = new Point[n];
        for (int i = 0; i < n; i++) {
            mas[i]=new Point();
            mas[i].x = (int) (Math.random() * 10 + 1);
            mas[i].y = (int) (Math.random() * 10 + 1);
        }
        show(mas);
        System.out.println();
        System.out.printf("MAX distance = " + distance(mas));
    }

    public static double distance(Point[] mas) {
        double[] dist = new double[mas.length];
        double[] temp = new double[mas.length];
        double result;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 1; j < mas.length; j++) {
                double distance;

                distance = Math.sqrt(Math.pow(mas[i].x - mas[j].x, 2) + Math.pow(mas[i].y - mas[j].y, 2));
                temp[j] = distance;
            }
            dist[i] = findMax(temp);
        }
        result = findMax(dist);
        return result;
    }

    public static double findMax(double[] mas) {
        double max = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
            }
        }
        return max;
    }

    public static void show(Point[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.printf("Point [" + i + "] : x = " + mas[i].x + " y = " + mas[i].y + "\n");
        }
    }
}

