import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        List<String> result = new ArrayList<String>();
        int a, b = 0;

        while (((a = sc.nextInt()) != 0) && ((b = sc.nextInt()) != 0)) {

            result.add(Integer.toString(a + b));
        }

        System.out.println(String.join("\n", result));
    }
}