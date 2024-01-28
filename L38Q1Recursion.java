public class L38Q1Recursion {    
    public static void main(String[] args) {
        String s = "Nitesh Maurya";
        String ans = RemoveA(s, 0);
        System.out.println(ans);
    }
    static String RemoveA(String s,int idx){
        // base case
        if(idx>=s.length())
        return "";

        //recursive work 
        String smallAns = RemoveA(s, idx+1);

        // self work
        if(s.charAt(idx)!='a')
        return s.charAt(idx)+ smallAns ;
        return smallAns;
    }
}
