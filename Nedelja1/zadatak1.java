import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner user_input = new Scanner(System.in);
        String first_team;
        System.out.println("unesite ime prvog tima");
        first_team = user_input.next();
        String second_team;
        System.out.println("unesite ime drugog tima");
        second_team = user_input.next();
        System.out.println("unesite brojeve zlatnih,srebrnih i bronzanih medalja za prvi, a zatim za drugi tim");
        int Z1 = sc.nextInt();
        int S1 = sc.nextInt();
        int B1 = sc.nextInt();
        int Z2 = sc.nextInt();
        int S2 = sc.nextInt();
        int B2 = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        sum1 = Z1 + S1 + B1;
        sum2 = Z2 + S2 + B2;
        if (sum1 > sum2) {
            System.out.println("" + first_team);

        } else if (sum1 == sum2 && (Z1 > Z2 || ((Z1 == Z2) && (S1 > S2)) || ((Z1 == Z2) && (S1 == S2) && (B1 > B2)))) {
            System.out.println("" + first_team);

        } else {
            System.out.println("" + second_team);

        }
    }

}
