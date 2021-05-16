package by.epam.unit02.main;

public class Task07 {
    public static void main(String[] args) {
        double a = 3;
        double b = 0;
        double c = -2;

        double result_a;
        double result_b;
        double result_c;

        if (a == 0) {
            System.out.println("Неверное значение.");
            //result_a = Double.NaN;
        }
        if (a > 0) {
            result_a = Math.pow(a, 2);
            System.out.println("result_a = " + result_a);
        } else {
            result_a = Math.pow(a, 4);
            System.out.println("result_a = " + result_a);
        }


        if (b == 0) {
            System.out.println("Неверное значение.");
            //result_b = Double.NaN;
        } else if (b > 0) {
            result_b = Math.pow(b, 2);
            System.out.println("result_b = " + result_b);
        } else {
            result_b = Math.pow(b, 4);
            System.out.println("result_b = " + result_b);
        }

        if (c == 0) {
            System.out.println("Неверное значение.");
            //result_c = Double.NaN;
        }
        if (c > 0) {
            result_c = Math.pow(c, 2);
            System.out.println("result_c = " + result_c);
        } else {
            result_c = Math.pow(c, 4);
            System.out.println("result_c = " + result_c);
        }
    }
}