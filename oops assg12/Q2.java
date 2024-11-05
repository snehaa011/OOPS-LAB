import java.util.HashMap;

class SessionManager{
    public static SessionManager instance = new SessionManager();

    //TODO: create a list of tuples - need to add javatuples
    private static HashMap<String,String> up= new HashMap<>();
    
    private SessionManager() {}

    public static SessionManager getInstance(){
        return instance;
    }

    public void signup(String username, String password){
        if (up.get(username)==null){
            up.put(username, password);
            System.out.println("Signed up successfully");
        }else{
            System.out.println("Username exists!");
        }
    }

    public void login(String username, String password){
        if (up.get(username)!=null){
            if (up.get(username)==password){
                System.out.println("Logged in successfully");
            }else{
                System.out.println("Password incorrect");
            }
        }else{
            System.out.println("Username incorrect");
        }
    }

}

public class Q2 {
    public static void main(String[] args) {
        SessionManager sm= SessionManager.getInstance();
        sm.signup("san23", "1234");
        sm.login("san123", "1234");
        sm.login("san23", "12");
        sm.login("san23", "1234");
        sm.signup("san23", "hello");
    }
}
