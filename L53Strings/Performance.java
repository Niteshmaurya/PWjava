public class Performance { // poor performance can be improve by spring builder

    public static void main(String[] args) {
        String s = "";
        for (int i = 0; i < 10; i++) { // its not O(n)
            s = s + i; // its O(n(n+1)/2) ;
        }
        System.out.println(s); 
    }
}
