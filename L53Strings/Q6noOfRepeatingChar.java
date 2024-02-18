public class Q6noOfRepeatingChar {
    public static void main(String[] args) {
        // String s = "aaabbbbccdddee";              
        String s = "aaa";
        NoOfChar(s);
    }
    static void NoOfChar(String s ){
        int count = 1;  
        for(int i =0;i<s.length()-1;i++){  
            int ch = s.charAt(i);
            int nextCh = s.charAt(i+1);
            int noChar = 1;
            if(ch == nextCh){ 
                count++; 
                // ans.append(count);
            }
            else{ 
                noChar = count;  
                count =1;
                ans.append(noChar);
                noChar = 1;
            }
        }
        System.out.println(ans);   
        System.out.println("no. of count "+count);   
    }
}
