public class L38Q3 {
    public static void main(String[] args) {
        String s = "abba";
        System.out.println(isPallindrome(s, 0)); 
    }
    static boolean isPallindrome(String s,int idx){
        System.out.println("reversed string "+rev(s, idx)); 
        if(s.equals(rev(s, idx))) return true;
        else 
        return false;
    }
    static String rev(String s ,int idx){
        if(idx==s.length())
        return "";

        // recursive work 
        String smallAns = rev(s, idx+1);

        //self work
        return smallAns + s.charAt(idx);
    }
}
