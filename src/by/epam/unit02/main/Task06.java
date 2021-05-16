package by.epam.unit02.main;

public class Task06 {
    public static void main(String[] args) {
        double x = 125;
        double y = 7;
        double z = x / y; //17.857142...
        int a;
        a = (int) z; //17
        System.out.println("Младшая цифра целой части = " + a % 10);
        double b;
        b = z - a; //0.85714...
        b = b * 10;
        System.out.println("Старшая цифра дробной части = " + (int) b);
    }
}
