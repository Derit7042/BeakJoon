package Chapter4.chap4_04;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[9];
        Scanner scanner = new Scanner(System.in);
        int max = intArray[0];
        for (int i = 0; i < 9; i++) {
            int a = scanner.nextInt();
            intArray[i] = a;
            if (max < intArray[i]) {
                max = intArray[i];
            }
        }
        System.out.println(max);
        int num = Arrays.asList(intArray).indexOf(max);
        System.out.println(num+1);
    }
}
