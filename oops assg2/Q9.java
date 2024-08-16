import java.util.*;
public class Q9 {
    public class Student{
        int rollNumber;
        String fullName;
        double height;
        double weight;
        String assignedTeacher;
        Student(int no, String name, double h, double w, String t){
            rollNumber=no;
            fullName=name;
            height=h;
            weight=w;
            assignedTeacher=t;
        }
        void display(){
            System.out.println();
            System.out.println("Roll Number: "+rollNumber);
            System.out.println("Full Name: "+ fullName);
            System.out.println("Height: "+height);
            System.out.println("Weight: "+weight);
            System.out.println("Assigned Teacher: "+assignedTeacher);
            System.out.println();
        }
    }
    
    public class Teacher{
        int teacherId;
        String teacherName;
        Teacher(int id, String name){
            teacherId=id;
            teacherName=name;
        }
    }

    static void sort(ArrayList<Student> s){
        for (int i=0; i<s.size(); i++){
            for (int j=i+1; j<s.size(); j++){
                if (s.get(i).height> s.get(j).height){
                    Student temp=s.get(i);
                    s.set(i,s.get(j));
                    s.set(j,temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        ArrayList<Teacher> t=new ArrayList<>();
        Q9 obj= new Q9();
        t.add(obj.new Teacher(1, "Ms. Vinita"));
        t.add(obj.new Teacher(2, "Mr. Renjith"));
        t.add(obj.new Teacher(3, "Ms. Sajitha"));

        System.out.print("Enter the no. of students to add: ");
        int n=sc.nextInt();
        ArrayList<Student> arr= new ArrayList<>();

        for(int i=0; i<n; i++){
            System.out.print("Enter roll no.: ");
            int roll=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter full name: ");
            String name=sc.nextLine();

            System.out.print("Enter height: ");
            double h=sc.nextDouble();

            System.out.print("Enter weight: ");
            double w=sc.nextDouble();

            System.out.println("Available teachers: ");
            for (int j=0; j<3; j++){
                System.out.println(t.get(j).teacherId + ". " + t.get(j).teacherName);
            }

            System.out.print("Choose a teacher by ID: ");
            int id=sc.nextInt();

            arr.add(obj.new Student(roll, name, h, w, t.get(id-1).teacherName));
        }

        sort(arr);
        
        System.out.println("Student details sorted by height: ");

        for (int i=0; i<n; i++){
            arr.get(i).display();
        }

        System.out.println("Student and Assigned Teachers:");
        for (int i=0; i<n; i++){
            System.out.println(arr.get(i).fullName+" - "+ arr.get(i).assignedTeacher);
        }

        sc.close();
    }
}

