public class L38Q3palindV2 {
    public static void main(String[] args) {
        String s = "abba";  
        boolean ans = isPallindrome(s, 0,s.length()-1);
        boolean ans2 = isPallindrome2(s, 0,s.length()-1);
        System.out.println(ans);
        System.out.println(ans2);

    }
    static boolean isPallindrome2(String s,int l,int r){
        if(l>=r)
        return true;

        return (s.charAt(r)==s.charAt(l))&&isPallindrome2(s, l+1, r-1);
    }
    static boolean isPallindrome(String s, int l ,int r){
        if(l>=r)
        return true;

        // self work 
        if(s.charAt(l)==s.charAt(r))
        return  isPallindrome(s, l+1, r-1); 
        else 
        return false;
    }
}
