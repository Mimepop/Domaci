import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class zadatak {
   /* public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 3, 5, 8, 9, 6, 12);
        System.out.println(divBy3Plus2(numbers));
        System.out.println(doubledNumbersDivByThree(numbers));
        System.out.println(oddsMulTwo(numbers));
    }*/

    public static List<Integer> divBy3Plus2(List<Integer> numbers) {
        List<Integer> list = numbers.stream().
                map(x -> x % 3 == 0 ? x + 2 : x).collect(Collectors.toList());
        return list;
    }

    public static List<Integer> doubledNumbersDivByThree(List<Integer> numbers) {
        List<Integer> list = numbers.stream().
                map(x -> x * x).
                collect(Collectors.toList());
        list.removeIf(x -> x % 3 == 0);

        return list;
    }

    public static List<Integer> oddsMulTwo(List<Integer> numbers) {
        List<Integer> list = numbers.stream().
                map(x -> x % 2 != 0 ? x * 2 : x).
                collect(Collectors.toList());
        return new ArrayList<>(new HashSet<>(list));
    }
}
