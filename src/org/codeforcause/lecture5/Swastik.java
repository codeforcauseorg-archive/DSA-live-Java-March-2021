package org.codeforcause.lecture5;

public class Swastik {
    public static void main(String[] args) {
        swastik(5);
    }

    public static void swastik(int n) {
        int row = 0, col;
        while (row < n) {
            col = 0;
            while (col < n) {
                if ((row == 0 && col >= n/2)|| (col == 0 && row < n/2)
                        || (row == n-1 && col <= n/2) || (col == n-1 && row >= n/2)
                        || row == n/2 || col == n/2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
