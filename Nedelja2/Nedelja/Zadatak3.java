import java.util.Scanner;
public class Zadatak3 {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        System.out.println("Sum of digits is: " + sumOfDigits(number));
    }

    public static int sumOfDigits(String num) {
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            int digit = Character.getNumericValue(num.charAt(i));
            sum += digit;
        }
        return sum;
    }

}