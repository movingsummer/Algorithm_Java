import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder res = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                res.append(Character.toLowerCase(c));
            } else {
                res.append(Character.toUpperCase(c));
            }
        }

        System.out.println(String.join("", res));
    }
}