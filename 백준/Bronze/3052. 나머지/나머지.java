import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>(42);
        int ans = 0;

        for (int i = 0; i < 42; i++) {
            arr.add(0);
        }

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt() % 42;

            if (arr.get(num) == 0) {
                ans++;
                arr.set(num, 1);
            }
        }

        System.out.println(ans);
    }
}