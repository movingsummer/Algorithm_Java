import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        int t = Integer.parseInt(br.readLine());
        List<String> result = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            String[] ab = br.readLine().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);
            result.add(Integer.toString(a + b));
        }

        bw.write(String.join((CharSequence) "\n", result));
        bw.flush();
        bw.close();
    }
}