public class L14Q2 {
    public static void main(String[] args) {
        int arr[] = {3,5,744,253,45};
        // MaxElem(arr)
        System.out.println(MaxElem(arr));
    }
    static int MaxElem(int kam[]){   
        int i = 0;
        int max = kam[0];
        for(int maxy : kam){
            if(max<maxy)
            max = maxy;
        }
        return max;
    }
}
