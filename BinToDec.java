import java.lang.Math;
               // there are three types of programming paradigm procedural,functional,object oriented


public interface BinToDec {
    public static void main(String[] args) {
        int ans =0;
        int Bin = 1111;
        int last;
        int pw = 0;
        while(Bin>0){
            last = Bin %10;
            ans = ans + (last*(int)(Math.pow(2, pw)));   
            pw = pw+1;
            Bin = Bin/10;
        }
        System.out.println(("Decimal is "+ans));   

    }
}
