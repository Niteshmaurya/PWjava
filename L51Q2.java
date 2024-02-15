public class L51Q2 {
    public static void main(String[] args) {
        int arr[][]={{2,4,6,8},
                     {5,6,7,20},
                     {7,11,13,25},
                     {12,14,17,30}};
        int t = 1;
        System.out.println(findElement(arr, t));
    }
    static boolean findElement(int arr[][],int t){
        int i =0;
        int col = arr[0].length;
        int j = col -1;
        while (j>=0&& i < col) { 
            if(arr[i][j]==t)
            return true;
            else if(arr[i][j]<t)
            i++;
            else
            j--;
        }
        return false;
    }
}
