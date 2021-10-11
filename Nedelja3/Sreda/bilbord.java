import java.util.Scanner;

public class bilbord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String poruka = sc.nextLine();
        str(poruka);
    }

    public static void str(String por) {
        System.out.println(por.replaceAll("[^a-zA-Z0-9 ]", ""));
    }
}
