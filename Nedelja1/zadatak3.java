import java.util.Scanner;

public class zadatak3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double price = 0.0;
        int art = 0;
        do {
            System.out.println("Unesite cenu:");
            price = sc.nextDouble();
            if (price > 0) {
                sum += price;
                art++;
            } else{
                System.out.println("negativne cifre nece ulaziti u prosek");
            }
        } while (price != 0);

        double avg = sum / art;
        if(sum==0){
            avg=0;
        }
        System.out.println("Prosek: ");
        System.out.print(avg);
    }
}

