public class L25Transpose {
    public static void main(String[] args) {
        int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int r =3,c=3;
        printMatrix(arr1);  
        System.out.println("after transposing");
        Transopose(arr1,r,c);
    }
    static void Transopose(int arr1[][],int r,int c){
        // int[][] ans = new int[c][r];
        int temp;
        for(int i =0;i<c;i++){
            for(int j =i;j<r;j++){
                temp = arr1[i][j];   
                arr1[i][j] = arr1[j][i]; 
                arr1[j][i] = temp;  
            }
        }
        printMatrix(arr1); 
        
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
