import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String c = sc.nextLine();
        int result = 0;

        for (int i = 0; i < n; i++) {
            result += Character.getNumericValue(c.charAt(i));
        }

        System.out.println(result);
    }
}