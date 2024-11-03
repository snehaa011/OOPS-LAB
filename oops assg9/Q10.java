import java.util.*;
class Student{
    private final String name;
    private int age;
    Student(String n, int a){
        name=n;
        age=a;
    }
    int getAge(){
        return age;
    }
    String getName(){
        return name;
    }
}

public class Q10 {
    public static void main(String[] args) {
        List<Student> sl= new ArrayList<>();
        sl.add(new Student("Anika", 20));
        sl.add(new Student("Ashwin", 18));
        sl.add(new Student("Rahul", 25));
        sl.add(new Student("Sneha", 19));
        OptionalDouble avgage=sl.stream().mapToInt(n->n.getAge()).average();
        System.out.println(avgage.getAsDouble());
    }
}
