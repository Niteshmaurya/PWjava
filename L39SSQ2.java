import java.util.ArrayList;

public class L39SSQ2 {
    public static void main(String[] args) {   // standard method to print SSQ
        String s = "abc";
        printSSQ(s,"");
    }
    static void printSSQ(String s,String currAns){
        if(s.length()==0){
            System.out.println(currAns);  
            return;
        }

        char curr = s.charAt(0);
        String remString = s.substring(1);
        printSSQ(remString, currAns+curr);    // add curr
        printSSQ(remString, currAns);   // do not add curr

    }
}
