package by.epam.student.khvesko.module02.sort;

//Сортировка вставками.
//        Дана последовательность a1, a2, ..., an
//        Требуется переставить числа в порядке возрастания.
//        Делается  это  следующим  образом.  Пусть a1, a2, ..., an - упорядоченная  последовательность,
//        т. е. a1 <= a2 <= ... <= an.  Берется  следующее  число ai+1 и  вставляется  в  последовательность  так,
//        чтобы  новая последовательность была тоже возрастающей.
//        Процесс производится до тех пор, пока все элементы от i+1 до n не будут перебраны.
//        Примечание. Место помещения очередного элемента в отсортированную часть производить с
//        помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.

import by.epam.student.khvesko.module02.array.ArrayCreator;

public class Sort5 {
    public static void main(String[] args) {
        int n=15;
        ArrayCreator arr=new ArrayCreator();
        int[] mas=arr.CreateIntArray(n);
        insertionSort(mas);
        show(mas);
    }

    public static void show(int[] array){
        for (int elem : array
             ) {
            System.out.print(elem+" ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {
                int tmp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = tmp;

            }
        }
    }

}
