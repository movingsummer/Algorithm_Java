import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        String[] result = new String[t];

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            result[i] = String.valueOf(a + b);
        }

        System.out.println(String.join("\n", result));
    }
}