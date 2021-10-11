import java.util.Scanner;

public class zadatak3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("b=");
        boolean b = sc.nextBoolean();
        System.out.print("i=");
        int i = sc.nextInt();
        System.out.print("d=");
        double d = sc.nextDouble();
        bid(b, i, d);
    }

    public static void bid(boolean b, int i, double d) {
        if (b == false) {
            System.out.println("boolean");
        }
        if (i > 49) {
            System.out.println("integer");
        }
        if (Math.floor(d) > i * 2) {
            System.out.print("Double. ");
        }
    }
}

