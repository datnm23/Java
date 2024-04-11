package MidExam;

public class Ex4 {
    int numberOfPrime = UserInput.getUserNumber();
    int[] arr = new int[numberOfPrime];

    int[] listOfPrime() {
        int number = 1;
        int countOfPrime = 0;
        while (countOfPrime < numberOfPrime) {
            if (CheckPrime.isPrimeNumber(number)) {
                arr[countOfPrime] = number;
                countOfPrime++;
            }
            number++;
        }
    return arr;
    }
}

class Ex4TestDrive {
    public static void main(String[] args) {
        System.out.println("Enter the number of prime numbers: ");
        Ex4 ex4 = new Ex4();
        System.out.println("Prime numbers in array:");
        for (int number : ex4.listOfPrime()) {
            System.out.print(number+",");
        }
    }
}