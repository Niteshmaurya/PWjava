public class Q4PalindromicSubstringm2 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("abcba");   
        int ans = NoOfPalSub(s);
        System.out.println(ans);  
    }
    static int NoOfPalSub(StringBuilder s){
        int count =0;
        for(int i =0;i <s.length();i++){
            for(int j =i+1;j<=s.length();j++){  
                System.out.print(s.substring(i,j)+" ");     
                StringBuilder st = new StringBuilder(s.subSequence(i, j));
                String ss = st + "";
                if(isPalindrome(ss)) count++;      
            }
        }
        return count;   
    }
    static boolean isPalindrome(String s ){
        int st = 0;
        int end = s.length()-1;
        while (st<=end) {
            char i = s.charAt(st);
            char j = s.charAt(end); 
            if(i == j)
            {
                st++;
                end--;
            }
            else
            return false;
        }
        return true;
    }
}
