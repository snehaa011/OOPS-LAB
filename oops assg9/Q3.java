import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("java");
        words.add("hello");
        words.add("world");
        words.add("functional programming");
        ArrayList<String> caps=new ArrayList<>();
        words.forEach((n)->{
            caps.add(n.toUpperCase());
        });
        caps.forEach(System.out::println);
    }
}
