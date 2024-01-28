public class L38Q1 {
    public static void main(String[] args) {
        String s = "abcax";
        String ans = "";
        for(int i =0;i<s.length();i++){
            if('a'!=s.charAt(i)){
                ans+=s.charAt(i);
            }
        } 
        System.out.println(ans);
    }
}
