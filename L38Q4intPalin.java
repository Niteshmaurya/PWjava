public class L38Q4intPalin {

     public static void main(String[] args) {
         int n = 121;
         rev(n);
     }
     static void rev(int n){
        int lastDig = n%10;
        int startDig = n/10;
        int rev =0;
        while(n>0){
            n = n%10;
        }
     }

}