package com.example;

public class FizzBuzzTranslate {
    public static String fizzBuzz(int number) {

        if (number <= 0) return "Number must be greater than 0";

        String fizzBuzzResult = checkFizzBuzzRules(number);
        if (fizzBuzzResult != null) return fizzBuzzResult;

        if (number < 100) return convertToVietnameseString(number);

        return String.valueOf(number);
    }

    private static String checkFizzBuzzRules(int number) {
        String numberString = String.valueOf(number);
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        if (numberString.contains("3")) {
            return "Fizz";
        }
        if (numberString.contains("5")) {
            return "Buzz";
        }
        return null;
    }

    private static String convertToVietnameseString(int number) {
        int donvi = number % 10;
        int chuc = number / 10;

        String chucStr = "";
        String donviStr = "";
        switch (donvi) {
            case 0: donviStr = ""; break;
            case 1: donviStr = "mot"; break;
            case 2: donviStr = "hai"; break;
            case 3: donviStr = "ba"; break;
            case 4: donviStr = "bon"; break;
            case 5: donviStr = "nam"; break;
            case 6: donviStr = "sau"; break;
            case 7: donviStr = "bay"; break;
            case 8: donviStr = "tam"; break;
            case 9: donviStr = "chin"; break;
        }

        switch (chuc) {
            case 1: chucStr = "muoi"; break;
            case 2: chucStr = "hai muoi"; break;
            case 3: chucStr = "ba muoi"; break;
            case 4: chucStr = "bon muoi"; break;
            case 5: chucStr = "nam muoi"; break;
            case 6: chucStr = "sau muoi"; break;
            case 7: chucStr = "bay muoi"; break;
            case 8: chucStr = "tam muoi"; break;
            case 9: chucStr = "chin muoi"; break;
        }

        if (chuc == 0) {
            return donviStr;
        } else if (donvi == 0) {
            return chucStr;
        } else {
            return chucStr + " " + donviStr;
        }
    }
}
