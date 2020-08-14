package by.epam.student.khvesko.module02.multi;

//16. Магическим квадратом порядка n называется квадратная матрица размера nxn,
// составленная из чисел 1, 2, 3, ..., 2 n так, что суммы по каждому столбцу,
// каждой строке и каждой из двух больших диагоналей равны между собой.
// Построить такой квадрат.

public class ArrayMulti16 {
    public static void main(String[] args) {
        final int N=3;
        int[][] magic=new int[N][N];
        boolean flag=true;
        int[] arr1=new int[N];//массив сумм строк
        int[] arr2=new int[N];//массив сумм столбцов
        int[] arr3=new int[2];//массив сумм диагоналей
        while(flag) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    magic[i][j]=(int)(Math.random()*10)+1;
                }
            }
            int count=0;
            //проверка сумм строк
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                   arr1[i]+=magic[i][j];
                }
            }
            for (int i = 1; i < N; i++) {
                if(arr1[0]==arr1[i]){
                    count++;
                }
            }
            /////////////////////////////////////
            if (count!=N-1){
                continue;
            }
            //проверка сумм столбцов
            count=0;
            for (int j = 0; j < N; j++) {
                for (int i = 0; i < N; i++) {
                    arr2[j]+=magic[i][j];
                }
            }
            for (int i = 1; i < N; i++) {
                if(arr1[0]==arr2[i]){
                    count++;
                }
            }
            ///////////////////////////////////
            if (count!=N-1){
                continue;
            }
            //проверка сумм диагоналей
            count=0;
            //главная диагональ
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if(i==j)
                    arr3[0]+=magic[i][j];
                }
            }
            //побочная диагональ
            for (int i = 0; i < N; i++) {
                for (int j = N-1; j >0; j--) {
                        arr3[0]+=magic[i][j];
                }
            }
           if(arr3[0]!=arr3[1]){
               continue;
           }else{
               flag=false;
           }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(" "+magic[i][j]+" ");
            }
            System.out.println();
        }
    }
}
