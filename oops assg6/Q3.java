class Student{
    String name;
    Student(String n){
        name=n;
    }
    String formatName(){
        String r="";
        for (int i=name.length()-1; i>=0; i--){
            r+=name.charAt(i);
        }
        return r;
    }

    int countVowels(){
        int c=0;
        String vowels="AEIOUaeiou";
        for (int i=0; i<name.length(); i++){
            if (vowels.contains(name.charAt(i)+""))
            {
                c++;
            }
        }
        return c;
    }

    boolean palindrome(){
        int n=name.length();
        String na=name.toLowerCase();
        for (int i=0; i<n/2; i++){
            if (na.charAt(i)!=na.charAt(n-i-1))
                return false;
        }
        return true;
    }
}

class NITCalicutStudent extends Student{
    String dept;
    String rollno;
    NITCalicutStudent(String n, String d, String r){
        super(n);
        dept=d;
        rollno=r;
    }
    @Override
    String formatName(){
        return super.formatName()+" (NIT Calicut)";
    }

    void display(){
        System.out.println("Student details: "+name+" - Dept: "+dept+", Roll NUmber: "+rollno);
    }
}
public class Q3 {
    public static void main(String[] args) {
        Student s=new Student("Rajesh");
        System.out.println("For a Student with name \"Rajesh\"");
        System.out.println("Reversed name: "+s.formatName());
        System.out.println("Vowel count: "+s.countVowels());
        System.out.println("Palindrome check: "+s.palindrome());
        NITCalicutStudent n= new NITCalicutStudent("Aziza", "Computer Science", "CS123");
        System.out.println("For NITCalicutStudent");
        n.display();
        System.out.println("Revered name with tag: "+n.formatName());
        System.out.println("Vowel count: "+n.countVowels());
        System.out.println("Palindrome check: "+n.palindrome());
    }
}
