package ru.job4j.condition;

public class SwitchWeek {

        public static String nameOfDay(int day) {
            String name;
        switch (day) {
            case 1:
                name = "Monday";
                break;
            case 2:
                name = "Tuesdy";
                break;
            case 3:
                name = "wednesday";
                break;
            case 4:
                name = "thursday";
                break;
            case 5:
                name = "friday";
                break;
            case 6:
                name = "saturday";
                break;
            case 7:
                name = "Sunday";
                break;
            default:
                name = "ERROR";
                break;

        }
        return name;
    }

   public static void main(String[] args) {
            String a = SwitchWeek.nameOfDay(5);
            System.out.println(a);
    }
}
