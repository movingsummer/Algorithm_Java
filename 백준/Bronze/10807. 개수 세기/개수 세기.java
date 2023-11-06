import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int ans = 0;
        List<Integer> arr = new ArrayList<Integer>();


        for (int i = 0; i < t; i++) {
            arr.add(sc.nextInt());
        }

        int target = sc.nextInt();

        for (int i = 0; i < t; i++) {
            ans += arr.get(i) == target ? 1 : 0;
        }

        System.out.println(ans);
    }
}