package org.codeforcause.lecture5;

public class PatternBasic {
    public static void main(String[] args) {
//        square(6);
//        upTriangle(4);
        downTriangle(5);
    }

    public static void square(int n) {
        int i, j = 0;
        while (j < n) {
            i = 0;
            while (i < n) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            j++;
        }
    }

    public static void upTriangle(int n) {
        int row = 0, col = 0;
        while (row < n) {
            col = 0;
            while (col <= row) {
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public static void downTriangle(int n) {
        int row = 0, col;
        while (row < n) {
            col = 0;
            while (col < n-row) {
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
