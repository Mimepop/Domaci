import java.util.Scanner;

public class zadatak5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        do{
            int secnumb=0;
            while(number>0) {
                int tmp = number % 10;
                secnumb += tmp;
                number = number / 10;
            }

            number=secnumb;

        }while(number>9);
            System.out.println(number);
    }
}
