import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pas = sc.nextLine();
        System.out.println(isValid(pas));
    }

    public static boolean isValid(String password) {
        char c;
        boolean upperCase = false;
        boolean length = false;

        for (int i = 0; i < password.length(); i++) {
            c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                upperCase = true;
            } else if (password.length() > 8) {
                length = true;
            }
            if (upperCase && length) {
                return true;
            }
        }
        return false;
    }
}