import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(String.format("%d\n%d\n%d\n%d\n%d", a + b, a - b, a * b, a / b, a % b));
    }
}