import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] tmp = sc.nextLine().split(" ");
        int num1 = Integer.parseInt(new StringBuilder(tmp[0]).reverse().toString());
        int num2 = Integer.parseInt(new StringBuilder(tmp[1]).reverse().toString());

        System.out.println(Math.max(num1, num2));
    }
}