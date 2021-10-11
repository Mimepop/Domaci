import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year1;
        int year2;
        do {
            System.out.println("year 1:");
            year1 = sc.nextInt();
            System.out.println("year 2:");
            year2 = sc.nextInt();
        } while (year1 == 0 || year2 == 0);
        int br = 0;
        for (int i = year1; i <= year2; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                br++;
            }
        }
        System.out.println(br);
    }
}
