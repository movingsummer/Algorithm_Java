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
        List<String> arr = new ArrayList<>(Collections.nCopies(n, "0"));

        for (int t = 0; t < m; t++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for (int v = i; v <= j; v++) {
                arr.set(v - 1, Integer.toString(k));
            }
        }

        System.out.println(String.join(" ", arr));
    }
}