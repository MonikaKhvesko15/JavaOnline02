package by.epam.student.khvesko.module02.decomposition;

//Даны числа X, Y, Z, Т — длины сторон четырехугольника.
// Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y — прямой.
public class Task9 {
    public static void main(String[] args) {
        CorrectEnterFromConsole cons=new CorrectEnterFromConsole();
        int x=cons.enterIntFromConsole("x >> ");
        int y=cons.enterIntFromConsole("y >> ");
        int z=cons.enterIntFromConsole("z >> ");
        int t=cons.enterIntFromConsole("t >> ");

        double square1=squareOfSquareTriangle(x,y);
        int hyp=(int)hypotenuse(x,y);
        double square2=squareGeron(z,t,hyp);
        double result=square1+square2;
        System.out.printf("Square = "+result);
    }

    public static double squareOfSquareTriangle(int a, int b){
        double sq;
        sq=(1.0/2.0)*a*b;
        return sq;
    }

    public static double hypotenuse(int a,int b){
        double hyp;
        hyp=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        return hyp;
    }

    public static double squareGeron(int a,int b,int c){
        double sq;
        double p;
        p=(a+b+c)/2;
        sq=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return sq;
    }
}
