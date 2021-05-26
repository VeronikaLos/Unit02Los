package by.epam.unit02.main;

public class Task09 {
    public static void main(String[] args) {
        double x = -4;

        if (x <= -3) {
            x = 9;
            System.out.println("x=" + x);

        } else if (x > 3) {
            x = 1 / (Math.pow(x, 2) + 1);
            System.out.println("x=" + x);

        } else {
            System.out.println("Значение не определено");
        }
    }// Молодец
}
