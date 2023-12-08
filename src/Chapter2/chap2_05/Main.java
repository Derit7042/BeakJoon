package Chapter2.chap2_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        if (M < 45) {
            if (H < 1){
                System.out.println(24 - ((1 - H)) + " " + (60 - (45 - M)));
            } else {
                System.out.println((H - 1) + " " + (60 - (45 - M)));
            }
        } else {
            System.out.println(H + " " + (M - 45));
        }
    }
}
