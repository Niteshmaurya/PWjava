import java.util.Scanner;

public class ToggleQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        System.out.println("enter string builder");
        StringBuilder st = new StringBuilder(sc.nextLine());
        // System.out.println(st);   

        // toggle 
        // PhysIcs --> pHYSics
        for(int i =0;i<st.length();i++){
            // P -> p
            // check -> alphabet- small,capital;
            boolean flag = true;  // true -> capital  
            char ch = st.charAt(i);
            if(ch==' ')continue;    
            int asci = (int)ch;     // ch
            // System.out.println("asci is "+asci);
            if(asci<65||asci>122) {
                break;  
            }
            if(asci>=97&&asci<=122) flag = false; 
            if(flag == true ){
                asci += 32;
                char dh = (char)asci;
                st.setCharAt(i, dh); 
            }
            else{
                asci -= 32;
                char dh = (char)asci; 
                st.setCharAt(i, dh);
            }
        }
        System.out.println("toggled");
            System.out.println(st);
    }
}  
  