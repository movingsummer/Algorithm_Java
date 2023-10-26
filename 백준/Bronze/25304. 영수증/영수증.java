import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int sum = 0;
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            sum += sc.nextInt() * sc.nextInt();
        }

        System.out.println(sum == total ? "Yes" : "No");
    }
}