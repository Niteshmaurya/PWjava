import java.util.ArrayList;

public class L39SSQ {
    public static void main(String[] args) {
        ArrayList<String> ans = new ArrayList<>();
        ans = getSSQ("abc");
        for(String ss : ans){
            System.out.println(ss);
        }
    }


    static ArrayList<String> getSSQ(String s){
        ArrayList<String> ans = new ArrayList<>();

        /*
         * s = "abc";
         */
        // base case 
        if(s.length()==0){
         ans.add("");
         return ans;
        }

        char currChar = s.charAt(0);   // a
        ArrayList<String> smallAns = getSSQ(s.substring(1));  // [bc,b,c,""]

        // ans ["abc","ab","ac","a","bc","b","a",""];
        for(String ss : smallAns)
        {
            ans.add(ss);
            ans.add(currChar+ss);
        }
        return ans;
    }
}
