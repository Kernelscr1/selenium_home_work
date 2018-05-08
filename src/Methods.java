/*
 * Selenium home work.
 * Created by Skriabin Kirill.
 */

import java.math.*;
import java.util.Arrays;

public class Methods {

    //Home Task 1
    static int factorial(int n) {
        int factorialisedNumber = 1;
        for (int i = 2; i <= n; i++) {
            factorialisedNumber = factorialisedNumber * i;
        }
        return factorialisedNumber;
    }

    //Home Task 2
    static double getDistance(int x1, int y1, int x2, int y2) {
        double x = (x2 - x1) ^ 2 + (y2 - y1) ^ 2;
        return Math.sqrt(x);
    }

    //Home Task 3
    static boolean triangleIsExist(int x, int y, int z) {

        if (((x < y + z) && (y < x + z) && (z < x + y)) || (x == y && y == z)) {
            return true;
        } else
            return false;

    }

    //Home Task 4
    static void printTriangle(int x) {
        System.out.println("Task 4.");
        for (int i = 1; i <= x; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("0 ");
            }
            System.out.println();
        }
    }

    //Home Task 5
    static String bmi(int weight, double height) {
        String low = "Low weight", normal = "Normal weight", over = "Over weight", veryHigh = "Very high";
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            return low;
        } else if ((bmi >= 18.5) && (bmi < 25)) {
            return normal;
        } else if ((bmi >= 25) && (bmi < 30)) {
            return over;
        } else {
            return veryHigh;
        }
    }

    //Home Task 6
    static String findSameNumberы(int number) {
        String error = "incorrect number";
        String sameNumbersExist = "The same numbers are find";
        String sameNumberNotExist = "The same numbers are not find";

        if (number < 100 || number > 999) {
            return error;
        }

        int firstDigit = number / 100;
        int secondDigit = (number % 100) / 10;
        int thirdDigit = number % 10;

        if (firstDigit == secondDigit || firstDigit == thirdDigit || secondDigit == thirdDigit) {
            return sameNumbersExist;
        } else {
            return sameNumberNotExist;
        }
    }

    //Home Task 7
    static double calcVolume(int length, double depth, int width) {
        double volume = length * depth * width;
        double numberOfLiter = volume * 1000;
        return numberOfLiter;
    }

    //Home Task 8
    static int numberOfStudentsWithBadAssessment() {
        int[] assessments = {2, 5, 5, 3, 4, 3, 3, 2, 3, 5, 2};
        int numberOfStudents = 0;
        for (int i = 0; i < assessments.length; i++) {
            if (assessments[i] == 2) {
                numberOfStudents++;
            }
        }
        return numberOfStudents;
    }

    // Home Task 9
    static String bestExchangeBank() {
        String bankName = "Bunk not find";
        double bestExchange = 50.0;

        String[] bankNameArray = {"Bank1", "Bank2", "Bank3", "Bank4", "Bank5", "Bank6", "Bank7", "Bank8"};
        double[] exchangeArray = {26.5, 26.51, 26.4, 26.2, 26.23, 26.36, 28.0, 25.9};

        for (int i = 0; i < bankNameArray.length; i++) {
            if (exchangeArray[i] < bestExchange) {
                bestExchange = exchangeArray[i];
                bankName = bankNameArray[i];
            }
        }
        return bankName;
    }

    // Home Task 10
    static void printSomeText(String s, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }

    //Home Task 11
    static int findMinNumber(int number1, int number2, int number3) {
        int[] array = {number1, number2, number3};
        Arrays.sort(array);

        int value = array[0];
        return value;
    }

    //Home Task 12
    static double getTriangleSquare(int side1, int side2, int side3) {
        double triangleSquare;
        double trianglePerimeter;

        if (triangleIsExist(side1, side2, side3)) {
            trianglePerimeter = 0.5 * (side1 + side2 + side3);
            triangleSquare = Math.sqrt(trianglePerimeter * (trianglePerimeter - side1) * (trianglePerimeter - side2) * (trianglePerimeter - side3));
        } else triangleSquare = -1.0;
        return triangleSquare;
    }

    //Home Task 13
    static double getTriangleSquare(int side1) {
        double triangleSquare;
        double trianglePerimeter;

        if (triangleIsExist(side1, side1, side1)) {
            trianglePerimeter = 0.5 * (side1 + side1 + side1);
            triangleSquare = Math.sqrt(trianglePerimeter * (trianglePerimeter - side1) * (trianglePerimeter - side1) * (trianglePerimeter - side1));
        } else triangleSquare = -1.0;
        return triangleSquare;
    }

    //Home Task 13
    static double getHexagonSquare(int a) {
        double hexagonSquare = getTriangleSquare(a) * 6;
        return hexagonSquare;
    }

    //Home Task 14
    static int sumOfFactorial() {
        int sum = 0;
        for (int i = 1; i <= 9; i++) {
            if (i % 2 != 0) {
                sum += factorial(i);
            }
        }
        return sum;
    }

    //Home Task 15
    static double discountAmount(double amount) {
        double total;

        if (amount <= 1000) {
            total = amount;
        } else if (amount > 1000 && amount <= 2000) {
            total = ((amount / 100) * 2) + amount;
        } else if (amount > 2000 && amount <= 5000) {
            total = ((amount / 100) * 5) + amount;
        } else {
            total = ((amount / 100) * 7) + amount;
        }
        return total;
    }


}
