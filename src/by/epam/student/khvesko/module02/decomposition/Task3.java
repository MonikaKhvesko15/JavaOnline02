package by.epam.student.khvesko.module02.decomposition;

// Вычислить площадь правильного шестиугольника со стороной а,
// используя метод вычисления площади треугольника

public class Task3 {
    public static void main(String[] args) {
        int v = 6;
        int a;
        CorrectEnterFromConsole cons=new CorrectEnterFromConsole();
        a=cons.enterIntFromConsole("a >> ");
        double result;
        result=areaOfARegularTriangle(a)*v;
        System.out.printf("S = "+result);
    }

    public static double areaOfARegularTriangle(int a){
        double s;
        s=(Math.pow(a,2)*Math.sqrt(3.0))/4;
        return s;
    }
}
