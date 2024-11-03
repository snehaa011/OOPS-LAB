import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        Predicate<String> startsWithA= s->s.startsWith("A");
        List<String> words = new ArrayList<>();
        words.add("APPLE");
        words.add("Australia");
        words.add("air");
        words.add("programming");
        List<String> wordsWithA= words.stream().filter(startsWithA).collect(Collectors.toList());
        wordsWithA.forEach(System.out::println);
    }
}
