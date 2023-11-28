import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {1, 1, 2, 2, 2, 8};
        List<String> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            arr.add(String.valueOf(numbers[i] - sc.nextInt()));
        }

        System.out.println(String.join(" ", arr));
    }
}