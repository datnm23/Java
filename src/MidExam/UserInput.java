package MidExam;

import java.util.Scanner;

public class UserInput {
    static Scanner sc = new Scanner(System.in);

    public static int getUserNumber() {
        return sc.nextInt();
    }

    public static String getUserEmail() {
        return sc.nextLine();
    }

    public static String getUserPhoneNumber() {
        return sc.nextLine();
    }
}