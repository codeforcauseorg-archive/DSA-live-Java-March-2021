package org.codeforcause.lecture5;

import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("Int: " + a);
        char ch = s.next().charAt(0);
        System.out.println("Char: " + ch);
        String str = s.next();
        System.out.println("String: " + str);
        s.nextLine();
        String line = s.nextLine();
        System.out.println("Stringline: " + line);
        int n = Integer.parseInt(s.nextLine());
        System.out.println(n);
    }
}
