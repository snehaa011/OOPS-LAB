import java.util.ArrayList;

public class Q2 {
   public static void main(String[] args) {
    ArrayList<String> words = new ArrayList<>();
        words.add("java");
        words.add("hello");
        words.add("world");
        words.add("functional programming");
        words.forEach(System.out::println);
   } 
}

/*
 * If you are using a lambda expression as an anonymous function but not doing anything with the argument passed, you can replace lambda expression with method reference.
Below code is a good example to replace lambdas with method reference

listOfNumbers.stream().sorted().forEach(number -> {
  System.out.println(number);
  }
);


Since we are not modifying the number argument here, we can replace the lambda expression:

number -> { 
  System.out.println(number); 
} 


with method reference as shown below:

listOfNumbers.stream().sorted.forEach(System.out::println);


but, if you modify the argument before passing it to another method then you cannot replace lambdas with method reference e.g. in the following case we cannot do that:

listOfNumbers.stream().sorted().forEach(number -> {
  System.out.println(String.valueOf(number));
  }
);

Read more: https://javarevisited.blogspot.com/2017/08/how-to-convert-lambda-expression-to-method-reference-in-java8-example.html#ixzz8ocWfWTvt

 */