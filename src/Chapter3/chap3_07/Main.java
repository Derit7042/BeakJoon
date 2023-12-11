package Chapter3.chap3_07;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(bf.readLine());

        for (int i = 1; i <= a; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            int c = Integer.parseInt(stringTokenizer.nextToken());
            int d = b+c;
            bw.write("Case #" + i + ": "+ d + "\n");
        }
        bw.flush();
        bw.close();
    }
}
