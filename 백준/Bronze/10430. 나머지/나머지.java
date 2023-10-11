import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        String result = String.format("%d\n%d\n%d\n%d",
                (a + b) % c,
                (((a % c) + (b % c)) % c),
                (a * b) % c,
                ((a % c) * (b % c) % c));

        System.out.println(result);
    }
}