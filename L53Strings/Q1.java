
public class Q1 {
    public static void main(String[] args) {
        String str = "abcd";
        // print a b c d ab bc cd abc bcd abcd   
        getSubstr(str);
    }    
    static void getSubstr(String str){
        for(int i =0;i<str.length();i++){
            for(int j =i+1;j<=str.length();j++){
                System.out.print(str.substring(i,j)+" ");
            }
            System.out.println("");
        }
    }
}
