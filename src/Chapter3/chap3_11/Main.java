package Chapter3.chap3_11;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (; ;) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = b + c;
            if ((b == 0) && (c == 0)) {
                break;
            }
            bw.write(d + "\n");
        }
        bw.flush();
        bw.close();
    }
}
