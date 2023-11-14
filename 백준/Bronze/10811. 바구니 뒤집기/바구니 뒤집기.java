import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> arr = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            arr.add(i + 1);
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;

            for (int j = a; j <= (a + b) / 2; j++) {
                int tmp = arr.get(j);
                arr.set(j, arr.get(a + b - j));
                arr.set(a + b - j, tmp);
            }
        }

        System.out.println(String.join(" ", arr.stream().map(String::valueOf).collect(Collectors.toList())));
    }
}