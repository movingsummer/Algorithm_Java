import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> res = new ArrayList<>();
        String[] rev = new String[n - 1];

        for (int i = 0; i < n; i++) {
            String tmp = " ".repeat(n - i - 1) + "*".repeat(2 * (i + 1) - 1);
            res.add(tmp);
            if (i == n - 1) break;
            rev[n - i - 2] = tmp;
        }

        System.out.println(String.join("\n", res) + "\n" + String.join("\n", rev));
    }
}