public class Q5revSentance {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("I am Nitesh Maurya ");
        // output should be like "I ma na rotacudE"
        RevStatment(s);
    }
    static void RevStatment(StringBuilder s){
        StringBuilder sb = new StringBuilder("");
        String ans = "";
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }
            else{     // jab character ki value actual me space ke barabar hoti hai tab 
                sb.reverse();
                ans += sb;
                ans += ' ';
                sb = new StringBuilder("");   // OR sb.delete(0,sb.length);
            }
        }
        sb.reverse(); 
        ans +=sb;
        System.out.println(ans);     
    }
}
