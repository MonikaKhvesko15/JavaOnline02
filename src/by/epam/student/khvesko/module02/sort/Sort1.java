package by.epam.student.khvesko.module02.sort;

import by.epam.student.khvesko.module02.array.ArrayCreator;

import java.util.Scanner;

//1. Заданы два одномерных массива с различным количеством элементов и натуральное число k.
// Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого

public class Sort1 {
    public static void main(String[] args) {
        int i = (int) (Math.random() * 10 + 5);
        int j = (int) (Math.random() * 10 + 1);
        ArrayCreator arr = new ArrayCreator();
        int[] array1 = arr.CreateIntArray(i);
        show(array1);
        int[] array2 = arr.CreateIntArray(j);
        show(array2);
        int k;
        System.out.print("k >> ");
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()==false){
            sc.next();
            System.out.print("k >> ");
        }
        k = sc.nextInt();
        if(k<0||k>array1.length){
            System.out.print("Значение к введено некорректно!");
            return;
        }
       show(unionArray(array1,array2,k));
    }

    public static void show(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i]+" ");
        }
        System.out.println();
    }

    public static int[] unionArray(int[] array1,int[] array2, int k){
        int a;
        a=array1.length+ array2.length;
        int[] arr=new int[a];
        for (int i = 0; i < a; i++) {
            if(i<=k-1){
                arr[i]=array1[i];
            }
            if(i>k-1&&i<=k-1+array2.length){
                arr[i]=array2[i-k];
            }
            if(i>k-1+array2.length&&i<a){
                arr[i]=array1[i- array2.length];
            }
        }
        return arr;
    }

}
