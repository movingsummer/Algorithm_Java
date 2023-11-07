import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int target = sc.nextInt();
        List<String> res = new ArrayList<String>();


        for (int i = 0; i < t; i++) {
            int tmp = sc.nextInt();

            if (tmp < target) {
                res.add(Integer.toString(tmp));
            }
        }


        System.out.println(String.join(" ", res));
    }
}