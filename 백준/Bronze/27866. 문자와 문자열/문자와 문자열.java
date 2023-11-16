import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int idx = sc.nextInt();

        System.out.println(str.charAt(idx - 1));
    }
}