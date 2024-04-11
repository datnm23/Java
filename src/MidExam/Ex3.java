package MidExam;

import java.util.Scanner;

public class Ex3 {
    int myNumber = UserInput.getUserNumber();
}

class Ex3TestDrive{
    public static void main(String[] args) {
        System.out.println("Input number: ");
        Ex3 ex = new Ex3();
        int number = ex.myNumber;
        if (CheckPrime.isPrimeNumber(number)){
            System.out.println(number+" is a prime number");
        } else {
            System.out.println(number+" is not a prime number");
        }
    }
}
