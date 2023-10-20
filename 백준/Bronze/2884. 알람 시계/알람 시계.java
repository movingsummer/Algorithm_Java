import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int totalMinute = (h * 60 + m + 1395) % 1440;

        int dh = totalMinute / 60;
        int dm = totalMinute % 60;
        System.out.println(dh + " " + dm);
    }
}