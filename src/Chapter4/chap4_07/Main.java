package Chapter4.chap4_07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        boolean[] arr = new boolean[31];
//
//        for (int i = 0; i < 28; i++) {
//            int input = scanner.nextInt();
//            arr[input] = true;
//        }
//
//        for (int j = 1; j <= 30; j++) {
//            if (!arr[j]) {
//                System.out.println(j);
//            }
//        }



        int[] arr2 = new int[31];

        for (int i = 0; i < 28; i++) {
            arr2[scanner.nextInt()] ++;
        }

        for (int j = 1; j<= 30; j++) {
            if (arr2[j] == 0) {
                System.out.println(j);
            }
        }
        scanner.close();
    }
}
