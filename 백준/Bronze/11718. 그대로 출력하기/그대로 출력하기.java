import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> res = new ArrayList<>();

        while (true) {
            String str = br.readLine();
            if (str == null) {
                break;
            }

            res.add(str);
        }

        System.out.println(String.join("\n", res));
    }
}