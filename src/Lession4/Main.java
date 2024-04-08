package Lession4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Homework 1
        System.out.println("Your name length:");
        Scanner sc = new Scanner(System.in);
        int lengthOfName = sc.nextInt();
        String[] yourName = inputYourName(lengthOfName);
        System.out.print("Your name is");
        for (String name : yourName) {
            System.out.print(convertName(name)+ " ");
        }
        //Homework 2
        //Input int array
        System.out.println();
        System.out.println("Input length of your int array:");
        int lengthOfArray = sc.nextInt();
        int [] myIntArray= inPutArray(lengthOfArray);
        //Print int array
        printMyArray(myIntArray);
        System.out.println();
        // change even number in array
        int[] oddMyNumber = updateEvenNumberMyArray(myIntArray);
        printMyArray(oddMyNumber);
    }

    public static String [] inputYourName(int n){
        Scanner sc = new Scanner(System.in);
        String[] newArray = new String[n];
        for ( int i = 0; i < n; i ++) {
            System.out.println("Input your name:");
            newArray[i]= sc.nextLine();
        }
        return newArray;
    }
    public static String convertName(String myName) {
        char firstLetter = myName.charAt(0);
        myName = myName.substring(0, 1).toUpperCase() + myName.substring(1);
        return myName;
    }
    public static int[] inPutArray(int n) {
        Scanner sc = new Scanner(System.in);
        int[] newArray = new int[n];
        for ( int i = 0; i < n; i ++) {
            System.out.println("Input your number:");
            newArray[i]= sc.nextInt();
        }
        return newArray;
    }
    public static void  printMyArray(int[] arr) {
        for (int number:arr){
            System.out.print(number);
        }
    }
    public static int[] updateEvenNumberMyArray (int[] arr) {
        for (int i = 0; i < arr.length; i ++) {
            if ( arr[i] % 2 == 0){
                arr[i]=arr[i]+1;
            }
        }
        return arr;
    }
}
