import java.util.ArrayList;

public class Q6 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("APPLE");
        words.add("Australia");
        words.add("air");
        words.add("programming");
        words.stream().filter(s->s.startsWith("A")).forEach(System.out::println);
    }
}
