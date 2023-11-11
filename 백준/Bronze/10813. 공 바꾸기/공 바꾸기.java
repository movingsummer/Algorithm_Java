import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<String> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(Integer.toString(i + 1));
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            String tmp = arr.get(a - 1);

            arr.set(a - 1, arr.get(b - 1));
            arr.set(b - 1, tmp);
        }

        System.out.println(String.join(" ", arr));
    }
}