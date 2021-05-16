package by.epam.unit02.main;

public class Task04 {
    public static void main(String[] args) {
        int y1 = 2;
        int y2 = 6;
        int x1 = 1;
        int x2 = 5;
        int sideA = y1 - y2;
        int sideB = x1 - x2;
        double length;
        length = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
        System.out.println("length=" + length);
    }
}
