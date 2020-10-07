package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        int length = word.length > pref.length ? pref.length : word.length;
        for (int i = 0; i < length; i++) {

                            if (pref[i] != word[i]) {
                    result = false;
                    break;
                }
            }
                return result;
    }

}
