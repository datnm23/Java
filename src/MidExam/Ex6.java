package MidExam;

import java.util.regex.Pattern;

public class Ex6 {
    String email;
    String phoneNumber;

    boolean checkEmail() {
        String EMAIL_PATTERN =
                "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        return Pattern.matches(EMAIL_PATTERN, email);
    }

    boolean checkPhoneNumber() {
        String PHONE_PATTERN = "^\\d$";
        return phoneNumber.length() >= 9 && phoneNumber.length() <= 11 && Pattern.matches(PHONE_PATTERN, phoneNumber);
    }
}

class Ex6TestDrive {
    public static void main(String[] args) {
        Ex6 ex6 = new Ex6();
        System.out.println("Enter email address: ");
        ex6.email = UserInput.getUserEmail();
        if (ex6.checkEmail()) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is not valid");
        }
        System.out.println("Enter phone number address: ");
        ex6.phoneNumber = UserInput.getUserPhoneNumber();
        if (ex6.checkEmail()) {
            System.out.println("Phone number is valid");
        } else {
            System.out.println("Phone number is not valid");
        }
    }
}