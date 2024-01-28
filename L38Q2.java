import java.util.Scanner;

public class L38Q2 {
    public static void main(String[] args) {
        System.out.println("Enter the string ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(revString(s,0));
        System.out.println(revString2(s));
    }
    static String revString(String s,int idx ){
        

        // base case 
        if(idx>=s.length())
        return "";  

        // recursive work
        String newS = revString(s,idx+1);

        // self work 
        return newS +s.charAt(idx);  
    }
    static String revString2(String s){
        

        // base case 
        if(s.length()==0)
        return "";  

        // recursive work
        String newS = revString2(s.substring(1));

        // self work 
        return newS +s.charAt(0);   
    }
}   // time complexity is O(n^2)
  