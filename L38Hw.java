public class L38Hw {
    public static void main(String[] args) {
        int n = 1234;
        int ans = revN(n);
        System.out.println(ans);
    }
    static int revN(int n ){
        if(n<10){
            return n;
        }
        else
        { 
            int lastDig = n %10;
            int remainingDig = n/10;
            int reversed = revN(remainingDig);
            int power = (int)Math.pow(10, String.valueOf(remainingDig).length());
            return lastDig * power + reversed;
        }
    }
}
