import java.util.Scanner;

public class Euclid {
    int r;
    static int Euclidos(int m, int n) {
        while (n != 0) {
            int cur = m % n;
            m = n;
            n = cur;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Euclidos(a, b));
    }
}
