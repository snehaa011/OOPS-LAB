import java.util.*;
import java.util.stream.Collectors;

public class Q7 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("APPLE");
        words.add("Australia");
        words.add("air");
        words.add("programming");
        List<String> wordsWithA= words.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());
        wordsWithA.forEach(System.out::println);
    }
}
