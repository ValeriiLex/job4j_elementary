package ru.job4j.free;

public class LeapYear {
    public static boolean checkYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0)) {
            return true;
        } else if ((year % 4 == 0) && (year % 400 == 0)) {
            return true;
        } 
        return false;
    }
}

