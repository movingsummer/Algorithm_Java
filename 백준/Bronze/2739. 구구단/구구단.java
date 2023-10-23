import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] res = new String[9];

        for (int i = 0; i < 9; i++) {
            res[i] = n + " * " + (i + 1) + " = " + n * (i + 1);
        }

        System.out.println(String.join("\n", res));
    }
}