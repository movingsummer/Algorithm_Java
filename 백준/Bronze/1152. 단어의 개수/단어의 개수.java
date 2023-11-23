import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int res = str.trim().split(" ").length;

        if (str.equals(" ")) {
            res--;
        }

        System.out.println(res);
    }
}