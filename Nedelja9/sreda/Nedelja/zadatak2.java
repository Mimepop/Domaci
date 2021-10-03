package Nedelja9.nedelja;

import java.util.Locale;

public class zadatak2 {
    public static String desifrovanje(String msg, int n) {
        StringBuilder result = new StringBuilder();
        String s = msg.toUpperCase().replaceAll("\\(","");
        for (char character : s.toCharArray()) {
                int originalAlphabetPosition = character - 'a';
                int newAlphabetPosition = (originalAlphabetPosition + n) % 26;
                char newCharacter = (char) ('a' + newAlphabetPosition);
                result.append(newCharacter);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = ">]aOZXWm[Wm\\OmaZOQYm^`WdOb\\cm^]`cYc(m8OdO\":gTS";
        for (int i = 0; i < 100; i++) {
            System.out.println("Used Shift " + i + "-----");
            System.out.println(desifrovanje(s, i).toUpperCase());
        }
    }
}
