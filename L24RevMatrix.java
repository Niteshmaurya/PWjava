public class L24RevMatrix {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{3,4,5},{7,8,9}};
        RevRow(arr);
    }
    static void printMatrix(int arr[][]){
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }  

    }
    static void RevRow(int arr[][]){
        int n = arr[0].length;
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<n/2-1;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][n-j];
                arr[i][n-j] = temp;
            }
        }
        printMatrix(arr);   
    }
}
