import java.util.ArrayList;

public class Q4 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("java");
        words.add("hello");
        words.add("world");
        words.add("functional programming");
        words.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
