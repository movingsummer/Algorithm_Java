import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int mid = str.length() / 2;
        int res = 1;

        for (int i = 0; i < mid; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                res = 0;
                break;
            }
        }

        System.out.println(res);
    }
}