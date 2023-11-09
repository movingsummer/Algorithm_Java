import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int mxIdx = 1;
        int mxVal = sc.nextInt();

        for (int i = 0; i < 8; i++) {
            int val = sc.nextInt();

            if (mxVal < val) {
                mxVal = val;
                mxIdx = i + 2;
            }
        }

        System.out.printf("%d\n%d", mxVal, mxIdx);

    }
}