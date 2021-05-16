package by.epam.unit02.main;

public class Task02 {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        int max;
        int min;

        max = Math.max(x,y);
        min = Math.min(x,y);

        x = max;
        y = min;

        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}
