package by.epam.unit02.main;

public class Task05 {
    public static void main(String[] args) {
        double x = 3;
        double y = 5;
        double temp1;
        double temp2;
        double result;

        temp1 = Math.sin(x) + Math.cos(y);
        temp2 = Math.cos(x) - Math.sin(y);

        if (temp2 != 0) {
            result = temp1 / temp2 * Math.tan(x * y);
        } else {
            System.out.println("Знаменатель равен нулю.");
            result = Double.NaN;
        }
        System.out.println("result=" + result);
    }
}
