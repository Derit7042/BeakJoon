package Chapter4.chap4_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] intArray = new int[a];
        for (int i = 0; i < a; i++) {
            int b = scanner.nextInt();
            intArray[i] = b;
        }
        int c = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < a; i++) {
            if (intArray[i] == c) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
