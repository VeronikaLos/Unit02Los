package by.epam.unit02.main;

public class Task08 {
    public static void main(String[] args) {
        int x1 = -6;
        int x2 = -3;
        int x3 = 4;
        int x4 = 7;
        int y1 = 7;
        int y2 = -4;

        int x = -3;
        int y = 5;

        if (y>=0 && y <= y1 && x >= x2 && x <= x3) {
            System.out.println(true);
        }// число визуально - не оставляют такой пробел в лесенке if-else

        else if (y<=0 && y >= y2 && x >= x1 && x <= x4) {
            System.out.println(true);
        }

        else {
            System.out.println(false);
        }
    }
}
