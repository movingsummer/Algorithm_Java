import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<String> result = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            String str = sc.nextLine();
            result.add(String.valueOf(str.charAt(0)) + String.valueOf(str.charAt(str.length() - 1)));
        }

        System.out.println(String.join("\n", result));
    }
}