package Chapter4.chap4_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] intArray = new int[a];
        for (int i = 0; i < a; i++) {
            int c = scanner.nextInt();
            intArray[i] = c;
        }
        for (int i = 0; i < a; i++) {
            if (intArray[i] < b) {
                System.out.print(intArray[i] + " ");
            }
        }
    }
}
