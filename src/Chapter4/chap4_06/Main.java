package Chapter4.chap4_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < b; i++) {
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            int x = arr[c-1];
            int y = arr[d-1];
            arr[c-1] = y;
            arr[d-1] = x;
        }
        for (int i = 0; i < a; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
