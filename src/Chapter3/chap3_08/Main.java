package Chapter3.chap3_08;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(bf.readLine());
         for (int i = 1; i <= a; i++) {
             StringTokenizer st = new StringTokenizer(bf.readLine());
             int b = Integer.parseInt(st.nextToken());
             int c = Integer.parseInt(st.nextToken());
             int d = b + c;
             bw.write("Case #" + i + ": " + b + " + " + c + " = " + d + "\n");
         }
        bw.flush();
        bw.close();
    }
}
