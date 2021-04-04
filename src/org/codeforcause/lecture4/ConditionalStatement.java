package org.codeforcause.lecture4;

public class ConditionalStatement {
    public static void main(String[] args) {
        int a = 7;
        int b = 12;
        System.out.println(a+b);

        if (a > 12) {
            System.out.println("Hey!");
        } else {
            System.out.println("Bye!");
        }

        int salary = 25493;

        if (salary < 15000) {
            System.out.println(salary+1000);
        } else {
            System.out.println(salary+1500);
        }
    }
}
