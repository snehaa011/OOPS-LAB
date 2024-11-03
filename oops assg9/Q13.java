import java.util.*;
public class Q13 {
    public static void main(String[] args) {
        List<Integer> num=new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        Optional<Integer> product=num.stream().reduce((a,b)->a*b);
        product.ifPresent(System.out::println);
    }
}
