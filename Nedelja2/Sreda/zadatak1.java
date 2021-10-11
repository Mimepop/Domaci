import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        minBr(x, y, z);
    }

    public static double minDvaBr(double a, double b) {
        if (a <= b)
            return a;
        return b;
    }

    public static void minBr(double x, double y, double z) {
        double d = minDvaBr(x, y);
        double res = minDvaBr(d, z);
        System.out.println(res);
    }

}
