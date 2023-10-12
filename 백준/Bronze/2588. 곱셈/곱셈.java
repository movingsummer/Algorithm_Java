import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String result = String.format("%d\n%d\n%d\n%d",
                a * (b % 10),
                a * (b / 10 % 10),
                a * (b / 100 % 10),
                a * b);
        System.out.println(result);
    }
}