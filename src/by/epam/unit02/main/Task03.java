package by.epam.unit02.main;

public class Task03 {
    public static void main(String[] args) {

        int numberOfSeconds;
        int hour, min, sec;
        int saveNumberOfSeconds;

        numberOfSeconds = 40000;
        saveNumberOfSeconds = numberOfSeconds;

        hour = numberOfSeconds / 3600;
        numberOfSeconds = numberOfSeconds - hour * 3600;
        min = numberOfSeconds / 60;
        numberOfSeconds = numberOfSeconds - min * 60;
        sec = numberOfSeconds;
        System.out.println("В " + saveNumberOfSeconds + " секундах: " +
                hour +"ч " + min + "мин " + sec + "с");
    }
}
