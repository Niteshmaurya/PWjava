public class L40KeypadMap {
    public static void main(String[] args) {
        String dig = "234";
        String kp[] = {"", "","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combination(dig, kp, "");
    }
    static void combination(String dig,String[] kp,String res){
        if(dig.length()==0){                   // base case
            System.out.print(res+"   ");
            return;
        }
        int currNum = (int)dig.charAt(0) ;
        // int currNum = dig.charAt(0) - '0';
        String currChoices = kp[currNum];

        for(int i =0;i<currChoices.length();i++){
            combination(dig.substring(1), kp, res+currChoices.charAt(i));
        }
    }
}
