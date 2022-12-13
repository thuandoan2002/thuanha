package controller.internship;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int value = sc.nextInt();
        int count = 0;
        long startTime = System.nanoTime();
        for (int i = 9; i <= value; i++) {
            int x = i;
            while (x > 8) {
                if (x % 10 == 9) {
                    count++;
                }
                x = x / 10;
            }
        }
        System.out.println("so lan xuat hien " + count);
        long endTime = System.currentTimeMillis();
        System.out.println(((endTime - startTime) / 10^9 )+" mls");
    }
}
