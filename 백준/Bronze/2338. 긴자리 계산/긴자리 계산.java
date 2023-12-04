import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        String res = a.add(b) + "\n" + a.subtract(b) + "\n" +
                a.multiply(b);
        
        System.out.println(res);
    }
}