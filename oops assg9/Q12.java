import java.util.*;
import java.util.stream.Collectors;

class StudentClass{
    private final String name;
    private int age;
    StudentClass(String n, int a){
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
        return name;
    }
}

public class Q12 {
    public static void main(String[] args) {
        List<StudentClass> sl= new ArrayList<>();
        sl.add(new StudentClass("Anika", 20));
        sl.add(new StudentClass("Ashwin", 19));
        sl.add(new StudentClass("Rahul", 20));
        sl.add(new StudentClass("Sneha", 19));
        Map<Integer,List<StudentClass>> slgrouped=sl.stream().collect(Collectors.groupingBy(StudentClass::getAge));
        System.out.println(slgrouped);
    }
}
