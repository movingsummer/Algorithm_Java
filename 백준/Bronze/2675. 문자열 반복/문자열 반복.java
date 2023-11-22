import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        List<String> result = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < t; i++) {
            String[] parts = sc.nextLine().split((" "));
            int num = Integer.parseInt(parts[0]);
            String s = parts[1];
            List<String> tmp = new ArrayList<>();

            for (int j = 0; j < s.length(); j++) {
                tmp.add(String.valueOf(s.charAt(j)).repeat(num));
            }

            result.add(String.join("", tmp));
        }

        System.out.println(String.join("\n", result));
    }
}