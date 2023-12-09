package Chapter2.chap2_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        if (B + C >= 60) {
            if ((B+C)/60 > 1) {
                if (A +(B+C)/60 > 23) {
                    System.out.println(((A+((B+C)/60))-24) + " " + ((B+C)-60*((B+C)/60)));
                } else {
                    System.out.println((A+((B+C)/60)) + " " + ((B+C)-60*((B+C)/60)));
                }
            } else {
                if (A == 23) {
                    System.out.println(((A+1)-24) + " " + ((B+C)-60));
                } else {
                    System.out.println((A+1) + " " + ((B+C)-60));
                }
            }
        } else {
            System.out.println(A + " " + (B+C));
        }
    }
}
