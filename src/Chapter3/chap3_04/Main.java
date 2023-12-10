package Chapter3.chap3_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int cost = 0;
        for (int i = 0; i < b; i++) {
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            cost += c*d;
        }
        if (a == cost) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
