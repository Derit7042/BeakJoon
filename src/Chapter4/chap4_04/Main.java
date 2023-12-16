package Chapter4.chap4_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[9];
        Scanner scanner = new Scanner(System.in);
        int max = intArray[0];
        int count = 0;
        for (int i = 0; i < 9; i++) {
            int a = scanner.nextInt();
            intArray[i] = a;
            if (max < intArray[i]) {
                max = intArray[i];
                count = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}
