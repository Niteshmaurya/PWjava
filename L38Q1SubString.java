public class L38Q1SubString {    
    public static void main(String[] args) {
        String s = "Nitesh Maurya";
        String ans = RemoveA(s);
        System.out.println(ans);
    }
    static String RemoveA(String s){
        // base case
        if(s.length()==0)
        return "";

        // recursive work
        String smallAns = RemoveA(s.substring(1, s.length()));

        // self work
        if(s.charAt(0)!='a')
        return s.charAt(0)+smallAns;  
        return smallAns;
    }
}   
// Time Complexity ==> no. of calls * no. of time taken in one call 
// O(n^2)   remember that String concatination is 
/*
 * in java you can concatinate two string using constant time complexity but in C++ you can't
 */
