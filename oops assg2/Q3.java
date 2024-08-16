import java.util.*;
public class Q3 {
    public static String find(ArrayList<String> temp){
        // String lcp="";
        // String temp=strs.get(0);
        // for (int i=0; i<strs.size()-1; i++){
        //     int j=0;
        //     lcp="";
        //     while (j<temp.length() && j<strs.get(i+1).length()){
        //         if (temp.charAt(j)==strs.get(i+1).charAt(j))
        //             lcp+=temp.charAt(j);
        //         else
        //             break;
        //         j++;
        //     }
        //     temp=lcp;
        // }
        // if(strs.size()==1)  return strs.get(0);
        // return lcp;

        if (temp.size() == 1) return temp.get(0);
        int ml=Integer.MAX_VALUE;
        String mw="";
        for (int j=0; j<temp.size(); j++){
            if (temp.get(j).length()<ml){
                ml= temp.get(j).length();
                mw= temp.get(j);
            }
        }
        String maxsub="";
        for (int i=0; i<ml; i++){
            for (int j=i+1; j<ml; j++){
                String sub=mw.substring(i, j);
                int flag=1;
                for (int k=0; k<temp.size(); k++){
                    if (!temp.get(k).contains(sub)) flag=0;
                }
                if (flag==1){
                    if (sub.length()> maxsub.length()){
                        maxsub=sub;
                    }
                }
            }
        }
        return maxsub;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<String>> str= new ArrayList<ArrayList<String>>();
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        for (int i=0; i<n; i++){
            System.out.println("Enter size of subarray: ");
            int m=sc.nextInt();
            System.out.println("Enter elements");
            ArrayList<String> temp= new ArrayList<String>();
            for (int j=0; j<m; j++){
                String w=sc.next();
                temp.add(w);
            }
            str.add(temp);
        }
        sc.close();
        for (int i=0; i<n; i++){
            ArrayList<String> temp=str.get(i);
            String ms= find(temp);
            for (int j=0; j<temp.size(); j++){
                temp.set(j, temp.get(j).replaceFirst(ms, ms.toUpperCase()));
            }
            str.set(i, temp);
        }
        for (int i=0; i<n; i++){
            ArrayList<String> temp=str.get(i);
            for (int j=0; j< temp.size(); j++){
                System.out.print(temp.get(j)+ " ");
            }
            System.out.println();
        }
    }
}
