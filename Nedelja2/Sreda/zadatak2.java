import java.util.Scanner;

public class zadatak2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 1;
        factorial(n);
    }

    public static void factorial(int n) {
        int f=1;
        if (n < 0) {
            System.out.println("cant find f of negative number");
        }
        else {
            for (int i = n; i > 0; i--) {
                f = f * i;

            }
            System.out.println(f);
        }

    }
}


