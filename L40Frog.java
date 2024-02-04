public class L40Frog {
    public static void main(String[] args) {
        int h[] = {10,30,40,20};   
        int n =h.length; 
        // shortestPath(h,n,0);
        System.out.println(shortestPath(h, n, 0));
    }

    static int shortestPath(int h[],int n,int idx){
        if(idx==n-1)
        return 0;

        int opt1 = Math.abs(h[idx]-h[idx+1]) + shortestPath(h, n, idx+1);
        if(idx==n-2)
        return opt1;

        int opt2 = Math.abs(h[idx]-h[idx+2]) + shortestPath(h, n, idx+2);

        return Math.min(opt1, opt2);  

    }
}

