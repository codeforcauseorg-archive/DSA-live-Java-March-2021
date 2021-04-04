package org.codeforcause.lecture5;

public class NumberFrame {
    public static void main(String[] args) {
        numberFrame(3);
    }

    public static void numberFrame(int n) {
        int i = 0, j = 0, row = n, col = n;
        while (i < 2*n+1) {
            j = 0;
            col = n;
            while (j < 2*n+1) {
                System.out.print(Math.max(row, col) + " ");
                if (j < n) {
                    col--;
                } else {
                    col++;
                }
                j++;
            }
            if (i < n) {
                row--;
            } else {
                row++;
            }
            System.out.println();
            i++;
        }
    }
}
