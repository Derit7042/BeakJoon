package Chapter4.chap4_07;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[28];

        for (int i = 0; i < 28; i++) {
            while(scanner.hasNextInt()) {
                int a = scanner.nextInt();
                arr[i] = a;
            }
        }
        Arrays.sort(arr);

        for (int i = 1; i < 27; i++) {
            if (arr[i] - 1 != arr[i-0]) {
                System.out.println(arr[i] + "a");
            }
        }

        System.out.println(Arrays.toString(arr));
        //for (int i = 0; i < 30; i++) {
        //    System.out.println(arr[i]);
        //}
    }
}
