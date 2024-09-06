import java.util.*;

interface SortVotes{
    void ascendDisplay();
    void descendDisplay();
}

class ElectionPost implements SortVotes{
    String nameOfPost;
    ElectionPost(String name){
        nameOfPost=name;
    }
    ArrayList<String> listOfCandidates=new ArrayList<>();
    ArrayList<String> votesEntered = new ArrayList<>();
    HashMap<String, Integer> count=new HashMap<>();
    void addCandidate(String n){
        listOfCandidates.add(n);
    }

    void addVote(String n){
        votesEntered.add(n);
        if (count.get(n)!=null){
            count.put(n,count.get(n)+1);
        }else{
            count.put(n,1);
        }
    }

    void display(){
        System.out.println(nameOfPost);
        for (int i=0; i<listOfCandidates.size(); i++){
            for (int j=i+1; j<listOfCandidates.size(); j++){
                if (listOfCandidates.get(i).compareTo(listOfCandidates.get(j))>0){
                    String temp=listOfCandidates.get(i);
                    listOfCandidates.set(i, listOfCandidates.get(j));
                    listOfCandidates.set(j, temp);
                }
            }
        }
        System.out.println("Candidates: ");
        for (int i=0; i<listOfCandidates.size(); i++){
            System.out.println(listOfCandidates.get(i));
        }
    }

    public void ascendDisplay(){
        for (int i=0; i<listOfCandidates.size(); i++){
            for (int j=i+1; j<listOfCandidates.size(); j++){
                if ((count.get(listOfCandidates.get(i))>count.get(listOfCandidates.get(j))) || (count.get(listOfCandidates.get(i))==null && count.get(listOfCandidates.get(j))!=null)){
                    String temp=listOfCandidates.get(i);
                    listOfCandidates.set(i, listOfCandidates.get(j));
                    listOfCandidates.set(j, temp);
                }
            }
        }

        for (int i=0; i<listOfCandidates.size(); i++){
            String n=listOfCandidates.get(i);
            int v=count.get(n)==null? 0: count.get(n);
            System.out.println(n+" - "+ v);
        }
    }

    public void descendDisplay(){
        for (int i=0; i<listOfCandidates.size(); i++){
            for (int j=i+1; j<listOfCandidates.size(); j++){
                if ((count.get(listOfCandidates.get(i)) < count.get(listOfCandidates.get(j))) || (count.get(listOfCandidates.get(i))!=null && count.get(listOfCandidates.get(j))==null)){
                    String temp=listOfCandidates.get(i);
                    listOfCandidates.set(i, listOfCandidates.get(j));
                    listOfCandidates.set(j, temp);
                }
            }
        }

        for (int i=0; i<listOfCandidates.size(); i++){
            String n=listOfCandidates.get(i);
            int v=count.get(n)==null? 0: count.get(n);
            System.out.println(n+" - "+ v);
        }
    }
}
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String na=sc.nextLine();
        ElectionPost ep=new ElectionPost(na);
        int numCandidates=sc.nextInt();
        sc.nextLine();
        for (int i=0; i<numCandidates; i++){
            ep.addCandidate(sc.nextLine());
        }
        int numVotes=sc.nextInt();
        sc.nextLine();
        for (int i=0; i<numVotes; i++){
            ep.addVote(sc.nextLine());
        }
        sc.close();
        ep.display();
        ep.ascendDisplay();
        ep.descendDisplay();
    }
}
