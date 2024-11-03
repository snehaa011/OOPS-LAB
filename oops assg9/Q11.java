import java.util.*;
class Stud{
    private final String name;
    private int age;
    Stud(String n, int a){
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

public class Q11 {
    public static void main(String[] args) {
        List<Stud> sl= new ArrayList<>();
        sl.add(new Stud("Anika", 20));
        sl.add(new Stud("Ashwin", 18));
        sl.add(new Stud("Rahul", 25));
        sl.add(new Stud("Sneha", 19));
        sl.stream().sorted((s1,s2)->s1.getAge()-s2.getAge()).forEach((s)->{System.out.println(s.getName()+" "+s.getAge());});
    }
}
