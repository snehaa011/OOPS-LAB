import java.util.ArrayList;

public class Q9 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("java");
        words.add("hello");
        words.add("world");
        words.add("functional programming");
        
        int sum= words.stream().mapToInt(String::length).sum();
        System.out.println(sum);
    }
}

/*
        list.stream().mapToInt(num -> Integer.parseInt(num)) 
                     .filter(num -> num % 3 == 0) 
                     .forEach(System.out::println); 
 */
