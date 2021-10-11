import java.util.ArrayList;

public class z16 {
    //16. Napisati funkciju koja prima ArrayList - u double -a i vraca ArrayList - u ciji su elementi za 2 veci od dupliranih elemenata iz prosledjene liste.
    public static ArrayList<Double> novaLista(ArrayList<Double> arr) {
        ArrayList<Double> x = new ArrayList<>();
        for (Double el : arr) {
            x.add(el * 2 + 2);
        }
        return x;
    }
}


