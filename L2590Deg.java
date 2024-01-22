public class L2590Deg {
    public static void main(String[] args) {
        int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int r =arr1.length,c=arr1[0].length;
        printMatrix(arr1);  
        System.out.println("after rotating 90 degree");
        rotate90CW(arr1,r,c);
    }
    static void rotate90CW(int arr1[][],int r,int c){
        int temp;
        int[][] ans = new int[c][r];
        for(int i =0;i<c;i++){
            for(int j =i;j<r;j++){      
                temp = arr1[i][j];
                arr1[i][j] = arr1[j][i];
                arr1[j][i] = temp;
            }
        }
        revArray(arr1);
        // printMatrix(arr1); 
        
    }

    static void revArray(int arr[][]){
        int n = arr[0].length;
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<(n)/2;j++){   
                int temp = arr[i][j];
                arr[i][j] = arr[i][n-1-j];    
                arr[i][n-1-j] = temp;   
            }
        }
        printMatrix(arr);  
    }
    static void printMatrix(int arr[][]){
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }  

    }
}
