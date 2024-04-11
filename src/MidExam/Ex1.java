package MidExam;

public class Ex1 {
    String [][] arr;

    public void drawSquare() {
        for (String[] row : arr) {
            for (int j = 0; j < row.length; j++) {

                System.out.print("*" + "\t");
            }
            System.out.println("\n");
        }
    }

    public void drawHaftLeftSquare() {
        for (int i = 0; i < arr.length; i ++ ) {
            for (int j = 0; j < arr[i].length; j ++) {
                if ( i >=j ) {
                    arr[i][j]="*";
                } else {
                    arr[i][j]=" ";
                }
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
    public void drawHaftRightSquare() {
        for (int i = 0; i < arr.length; i ++ ) {
            for (int j = 0; j < arr[i].length; j ++) {
                if ( i + j >= arr.length-1 ) {
                    arr[i][j]="*";
                } else {
                    arr[i][j]=" ";
                }
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
}

class Ex1TestDrive {
    public static void main(String[] args) {
        Ex1 exam1 = new Ex1();
        exam1.arr = new String [4][4];
        System.out.println("Ex1.1");
        exam1.drawSquare();
        System.out.println("Ex1.2");
        exam1.drawHaftLeftSquare();
        System.out.println("Ex1.3");
        exam1.drawHaftRightSquare();

    }
}