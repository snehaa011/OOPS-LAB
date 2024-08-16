import java.util.*;
class Teacher{
    int teacherId;
    String teacherName;
    Teacher(int id, String name){
        teacherId=id;
        teacherName=name;
    }
}

public class Q8 {
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
    
    static void sort(Student[] s){
        for (int i=0; i<s.length; i++){
            for (int j=i+1; j<s.length; j++){
                if (s[i].height> s[j].height){
                    Student temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Teacher t[]=new Teacher[3];
        Q8 obj= new Q8();
        t[0]=new Teacher(1, "Ms. Vinita");
        t[1]=new Teacher(2, "Mr. Renjith");
        t[2]=new Teacher(3, "Ms. Sajitha");

        System.out.print("Enter the no. of students to add: ");
        int n=sc.nextInt();
        Student arr[]= new Student[n];

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
                System.out.println(t[j].teacherId + ". " + t[j].teacherName);
            }

            System.out.print("Choose a teacher by ID: ");
            int id=sc.nextInt();

            arr[i]=obj.new Student(roll, name, h, w, t[id-1].teacherName);
        }

        sort(arr);
        
        System.out.println("Student details sorted by height: ");

        for (int i=0; i<n; i++){
            arr[i].display();
        }

        System.out.println("Student and Assigned Teachers:");
        for (int i=0; i<n; i++){
            System.out.println(arr[i].fullName+" - "+ arr[i].assignedTeacher);
        }

        sc.close();
    }
}


/*
 * When you use nextLine() after nextInt() or nextDouble(), 
 * it reads the newline character left behind by these methods, 
 * resulting in skipping the actual input.
 * To handle this, you need to consume the leftover newline character 
 * before using nextLine().
 */
