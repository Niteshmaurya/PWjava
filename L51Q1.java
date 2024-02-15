public class L51Q1 {
    public static void main(String[] args) {
        int arr[][] = {{1,3,5,7},
                       {10,11,16,20},
                       {23,30,34,60} };
        int t = 4;
        System.out.println(BinarySearch(arr,t));                   
    }
    static boolean BinarySearch(int arr[][],int t ){
        int rows = arr.length;
        int coloumns = arr[0].length;
        int n = rows * coloumns;
        int st = 0; 
        int end = n-1;
        while (st<=end) {
            int mid = st + (end-st)/2;
            int r = mid/coloumns;
            int c = mid%coloumns;
            if(arr[r][c] ==  t)
            return true;
            else if (arr[r][c]<t){
                st= mid +1;
            }
            else
            end= mid -1;
        }
        return false;
    } 
}
