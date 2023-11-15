import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int m = -1;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (m < num) {
                m = num;
            }
            sum += num;
        }

        System.out.println((sum * 100) / (float) (n * m));
    }
}