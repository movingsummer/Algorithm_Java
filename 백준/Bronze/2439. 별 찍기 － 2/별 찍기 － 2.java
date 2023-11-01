import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> result = new ArrayList<String>();

        for (int i = 0; i < n; i++) {
            result.add(" ".repeat(n - i - 1) + "*".repeat(i + 1));
        }

        System.out.println(String.join("\n", result));
    }
}