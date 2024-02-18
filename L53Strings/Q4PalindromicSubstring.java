import java.util.*;    
public class Q4PalindromicSubstring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String");
        StringBuilder s = new StringBuilder(sc.nextLine());
        int ans = NoOfPalSub(s);  
        System.out.println("");
        System.out.print("no. of palindromic substirings are : "); 
        System.out.println(ans);
    }
    static int NoOfPalSub(StringBuilder s){
        int count =0;
        for(int i =0;i <s.length();i++){
            for(int j =i+1;j<=s.length();j++){  
                System.out.print(s.substring(i,j)+" ");     
                StringBuilder st = new StringBuilder(s.subSequence(i, j));
                if(isPalindrome(st)) count++;      
            }
        }
        return count;   
    }
    static boolean isPalindrome(StringBuilder s){
        StringBuilder orgS = s;
        StringBuilder revString = s.reverse();
        System.out.println("s is "+s);
        System.out.println("revString is "+revString);
        return orgS.equals(revString);  
    }
}
