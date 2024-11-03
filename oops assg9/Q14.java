import java.util.*;
class Student1{
    private final String name;
    private int age;
    Student1(String n, int a){
        name=n;
        age=a;
    }
    int getAge(){
        return age;
    }
    String getName(){
        return name;
    }
    @Override
    public String toString(){
        return name+" "+age;
    }
}

public class Q14 {
    public static void main(String[] args) {
        List<Student1> sl= new ArrayList<>();
        sl.add(new Student1("Anika", 25));
        sl.add(new Student1("Ashwin", 18));
        sl.add(new Student1("Rahul", 25));
        sl.add(new Student1("Sneha", 19));
        Optional<Student1> oldestStud= sl.stream().reduce((a,b)->a.getAge()>b.getAge()? a:b);
        oldestStud.ifPresent(System.out::println);
    }
}

/*
 * Stream.reduce() method is used to perform
 * a reduction on the elements of a stream 
 * using an associative accumulation function 
 * and returns an Optional. 
 * It is commonly used to aggregate or combine elements 
 * into a single result, such as computing 
 * the maximum, minimum, sum, or product. 
 */
