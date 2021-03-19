package com.codewithchang;

public class Main {

    public static void main(String[] args) {
        boolean results = isCatPlaying(true, 10);
        System.out.println(results);
        boolean results2 = isCatPlaying(false, 36);
        System.out.println(results2);
        boolean results3 = isCatPlaying(false, 35);
        System.out.println(results3);
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if(!summer && (temperature >= 25 && temperature <= 35)) {
            return true;
        } else if (summer && (temperature >= 25 && temperature <= 45)) {
            return true;
        } else {
            return false;
        }
    }
}
