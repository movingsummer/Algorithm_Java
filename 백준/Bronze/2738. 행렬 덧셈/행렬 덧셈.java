import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    arr[j][k] += sc.nextInt();
                }
            }
        }

        String res = Arrays.stream(arr).map(row -> Arrays.stream(row).mapToObj(String::valueOf).collect(Collectors.joining(" "))).collect(Collectors.joining("\n"));

        System.out.println(res);
    }
}