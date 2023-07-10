import java.util.List;
import java.util.stream.Collectors;

public class BasicStream {
    public static void main(String[] args) {
        List<String> names = List.of("Jahid", "Amina", "Komal", "Zakir");
        List<Integer> nums = List.of(10, 12, 30, 70, 400, 30);
        List<String> filteredNames = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
        System.out.println(filteredNames);
        List<Integer> filteredNums = nums.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println(filteredNums);
    }
}
