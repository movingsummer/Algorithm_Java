import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        List<String> resultArr = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            resultArr.add("-1");
        }

        for (int i = 0; i < str.length(); i++) {
            int asci = (int) str.charAt(i) - 'a';

            if (resultArr.get(asci) == "-1") {
                resultArr.set(asci, String.valueOf(i));
            }
        }

        System.out.println(String.join(" ", resultArr));
    }
}