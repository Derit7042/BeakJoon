package Chapter3.chap3_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a % 4 == 0) {
            int b = a / 4;
            for (int i = 0; i < b; i++) {
                System.out.print("long ");
            }
            System.out.println("int");
        }
    }
}
