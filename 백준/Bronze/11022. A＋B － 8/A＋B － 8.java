import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        List<String> res = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            res.add(String.format("Case #%d: %d + %d = %d", i + 1, a, b, a + b));
        }

        System.out.println(String.join("\n", res));
    }
}