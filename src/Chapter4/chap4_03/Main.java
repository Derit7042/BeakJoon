package Chapter4.chap4_03;

import java.util.Arrays;
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
        Arrays.sort(intArray);
        int min = intArray[0];
        int max = intArray[a-1];
        System.out.println(min + " " + max);
    }
}
