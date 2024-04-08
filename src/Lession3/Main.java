package Lession3;
public class Main {
    public static void main(String[] args) {
        String[] myStringArr = {"I", "am", "foo"};
        int[] myIntArr = {1, 5, 10, 15, 6, 48, 20};
        int numberOfRepeat = 10;
        // Homework 1:
        String[] ex1Strings = repeatStringV2(myStringArr, numberOfRepeat);
        for (String ex1String : ex1Strings) {
            System.out.print(ex1String);
        }
        System.out.println();
        // Homework 2,3:
        repeatStringWithCross(myStringArr, numberOfRepeat);
        System.out.println();
        // Homework 4
        System.out.println(sumOfMultiple(myIntArr));
        // Homework 5
        int radius = 5;
        System.out.println(areaOfGlobular(radius));
        //Homework 6
        printArray();
    }

    public static String[] repeatString(String[] arr, int numberRepeats) {
        int offset = arr.length;
        String[] newStringArray = new String[arr.length * numberRepeats];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < newStringArray.length; j += offset) {
                newStringArray[j] = arr[i];
            }
        }
        return newStringArray;
    }

    public static String[] repeatStringV2(String[] arr, int numberRepeats) {
        String[] newStringArray = new String[arr.length * numberRepeats];

        for (int i = 0; i < numberRepeats; i++) {
            int j = 0;
            while (j < arr.length) {
                newStringArray[i * arr.length + j] = arr[j];
                j++;
            }
        }
        return newStringArray;
    }

    public static void repeatStringWithCross(String[] arr, int numberRepeats) {
        String[] newStringArray = new String[(arr.length + 1) * numberRepeats - 1];
        for (int i = 0; i < numberRepeats; i++) {
            int j = 0;
            while (j < arr.length) {
                System.out.print(arr[j]);
                j++;
            }
            if (i < (numberRepeats - 1)) {
                System.out.print("-");
                ;
            }
        }
    }

    public static int sumOfMultiple(int[] arr) {
        int sum = 0;

        for (int number : arr) {
            if (number % 5 == 0) {
                sum = sum + number;
            }
        }

        return sum;
    }

    public static double areaOfGlobular(int radius) {
        final double PI = 3.14;
        return 4 * PI * Math.pow(radius, 3) / 3;
    }
    public static void printArray() {
        for (int i = 0; i < 100; i++ ) {
            if ( i% 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else{
                System.out.println("FizzBuzz");
            }
        }
    }
}