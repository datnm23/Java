package MidExam;
public class Ex5 {
    int rows = UserInput.getUserNumber();
    int cols = UserInput.getUserNumber();
    int[][] arr = new int[rows][cols];

    int[][] getArr() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Input number in [" + i + "] [" + j + "]: ");
                arr[i][j] = UserInput.getUserNumber();
            }
        }
        return arr;
    }

    void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    void drawSquareDiagonal() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    int[][] twoArr(int[][] arr1, int[][] arr2) {
        int[][] newArr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                newArr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return newArr;
    }


}

class Ex5TestDrive {
    public static void main(String[] args) {
        System.out.println("5.1.Input of array 1:");
        Ex5 ex1 = new Ex5();
        int[][] arr1 = ex1.getArr();
        System.out.println("5.2.Printing array:");
        ex1.printArr(arr1);
        System.out.println("5.3.Printing Diagonal array:");
        ex1.drawSquareDiagonal();

        System.out.println("5.4.Input of array 2:");
        Ex5 ex2 = new Ex5();
        int[][] arr2 = ex2.getArr();

        int[][] newArr = ex1.twoArr(arr1, arr2);
        System.out.println("Printing new array:");
        ex1.printArr(newArr);
    }
}
