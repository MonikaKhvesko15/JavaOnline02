package by.epam.student.khvesko.module02.multi;

public class ArrayMultiCreator {
    public Object CreateIntArrayMulti(final int M,final int N){
        int[][] array=new int[M][N];
        Object object=array;
        for (int i = 0; i <M ; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j]=(int)(Math.random()*9)+1;
            }
        }
        return object;
    }
}
