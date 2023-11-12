import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            arr.add(0);
        }

        for (int i = 0; i < 28; i++) {
            int idx = sc.nextInt() - 1;
            arr.set(idx, 1);
        }

        for (int i = 0; i < 30; i++) {
            if (arr.get(i) == 0) {
                result.add(i + 1);
            }
        }

        System.out.printf("%d\n%d", Math.min(result.get(0), result.get(1)), Math.max(result.get(0), result.get(1)));
    }
}