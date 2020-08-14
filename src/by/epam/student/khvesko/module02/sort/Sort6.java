package by.epam.student.khvesko.module02.sort;

//Сортировка  Шелла.  Дан  массив  n  действительных  чисел.  Требуется  упорядочить  его  по  возрастанию.
//        Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai<ai+1, то продвигаются
//        на  один  элемент  вперед.  Если ai>ai+1, то  производится  перестановка  и  сдвигаются  на  один  элемент  назад.
//        Составить алгоритм этой сортировки.

import by.epam.student.khvesko.module02.array.ArrayCreator;

public class Sort6 {
    public static void main(String[] args) {
        ArrayCreator arr=new ArrayCreator();
        int n=10;
        int[] mas =arr.CreateIntArray(n);
        shellSort(mas);
        show(mas);
    }

    public static void show(int[] array){
        for (int elem:array
             ) {
            System.out.printf(elem+" ");
        }
        System.out.println();
    }

    public static void shellSort(int[] array){
        int step = array.length / 2;

        while (step > 0) {

            for (int i = 0; i < (array.length - step); i++) {
                int tmpIndex = i;

                while ((tmpIndex >= 0) && (array[tmpIndex] > array[tmpIndex + step])) {
                    int tmp = array[tmpIndex];
                    array[tmpIndex] = array[tmpIndex + step];
                    array[tmpIndex + step] = tmp;
                    tmpIndex -= step;
                }
            }
            step /= 2;
        }
    }
}
