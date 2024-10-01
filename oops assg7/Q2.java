abstract class PlatformUser{
    String name;
    String email;
    String userId;
    PlatformUser(String n, String e, String uid){
        name=n;
        email=e;
        userId=uid;
    }
    abstract void accessPortal();
}

class Faculty extends PlatformUser{
    void accessPortal(){
        System.out.println("Portal access:\n"+"-Uploading course material\n"+"-Conducting live online lecture\n");
    }
    Faculty(String n, String e, String uid){
        super(n, e, uid);
    }
    void conductLiveSession(){
        System.out.println("Conducting live session");
    }
    void uploadRecordedLecture(){
        System.out.println("Uploading recorded lecture");
    }
    void uploadCourseMaterial(){
        System.out.println("Uploading course material");
    }
    void uploadAssignment(){
        System.out.println("Uploading an online assignment for students");
    }
}

class Student extends PlatformUser{
    Student(String n, String e, String uid){
        super(n, e, uid);
    }

    void accessPortal(){
        System.out.println("Portal access:\n"+"-Viewing online courses\n"+"-Attending live session\n"+"-Submitting assignments online\n");
    }

    void attendLiveSession(){
        System.out.println("Attending live session");
    }
    void viewRecordedLectures(){
        System.out.println("Viewing recorded lectures");
    }
    void submitAssignment(){
        System.out.println("Submitting assignment");
    }
}

public class Q2 {
    public static void main(String[] args) {
        System.out.println("-- Student access --");
        Student s = new Student("Alisha George", "alisha234@gmail.come", "b23045ec");
        System.out.println("Name: "+s.name+"\nEmail: "+s.email+"\nUserID: "+s.userId);
        s.accessPortal();
        s.attendLiveSession();
        s.viewRecordedLectures();
        s.submitAssignment();

        System.out.println("\n-- Faculty access --");
        Faculty f=new Faculty("Dr. Smith", "smith34@nitc.ac.in", "fac001ec");
        System.out.println("Name: "+f.name+"\nEmail: "+f.email+"\nUserID: "+f.userId);
        f.accessPortal();
        f.conductLiveSession();
        f.uploadCourseMaterial();
        f.uploadRecordedLecture();
        f.uploadAssignment();
    }
}
