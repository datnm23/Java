package Lession5;

public class Main {
    public static void main(String[] args) {
    String [][] square = new String[5][5];
    drawSquareDiagonal(square);
    drawHaftSquare(square);
    }
    public static void drawSquareDiagonal(String [][] arr) {
        for (int i = 0; i < arr.length; i ++ ) {
            for (int j = 0; j < arr[i].length; j ++) {
                if ( i ==j || i + j == arr.length-1) {
                    arr[i][j]="*";
                } else {
                    arr[i][j]=" ";
                }
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
    public static void drawHaftSquare(String [][] arr) {
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
}
