package by.epam.student.khvesko.module02.multi;

//15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class ArrayMulti15 {
    public static void main(String[] args) {
        final int M=7;
        final int N=7;
        ArrayMultiCreator arr=new ArrayMultiCreator();
        Object object=arr.CreateIntArrayMulti(M,N);
        int[][] multi=((int[][])object);
        //вывод начальной матрицы
        for (int i = 0; i <M ; i++) {
            for (int j = 0; j <N ; j++) {
                System.out.print(" "+multi[i][j]+" ");
            }
            System.out.println();
        }
        //поиск наибольшего элемента матрицы
        int max=multi[0][0];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (max < multi[i][j]) {
                    max = multi[i][j];
                }
            }
        }
        System.out.println("MAX="+max);
            ////////////////////////////////////
        //изменение матрицы по условию
            for (int j = 0; j <M ; j++) {
                for (int k = 0; k <N ; k++) {
                    if(multi[j][k]%2!=0){
                        multi[j][k]=max;
                    }
                }
            }
         ////////////////////////////////////////
        //вывод конечной матрицы
        for (int i = 0; i <M ; i++) {
            for (int j = 0; j <N ; j++) {
                System.out.print(" "+multi[i][j]+" ");
            }
            System.out.println();
        }
    }
}
