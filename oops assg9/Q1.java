import java.util.*;

public class Q1{
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("java");
        words.add("hello");
        words.add("world");
        words.add("functional programming");
        words.forEach((n)->{System.out.println(n);});
    }
}