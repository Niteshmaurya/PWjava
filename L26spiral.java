import java.util.Scanner;

public class L26spiral {
    public static void main(String[] args) {
        // TakeMatrix();
        // int arr1[][] = new int[4][4];
    //    int arr1[][] = { {1,2,3,4,5},
    //                     {6,7,8,9,10},
    //                     {11,12,13,14,15},
    //                     {16,17,18,19,20},
    //                     {21,22,23,24,25}};    
    TakeMatrix(); 
    }        
    static void TakeMatrix(){
        System.out.println("Enter the rows and columns");   
        Scanner sc = new Scanner(System.in);
        int r =sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter the all "+r*c+ "elements ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();  
            }
        }
        makeSpiral(arr);
    }

    static void makeSpiral(int arr[][]){                      

        int r =  arr.length;
        int c = arr[0].length;
        int totalElement = 0;
        int tr = 0,br = r-1,rc = c-1,lc = 0;


        while(totalElement<r*c){
            // topRow --> lc to rc
            for(int j=lc;j<=rc && totalElement<r*c;j++){
                System.out.print(arr[tr][j]+ " ");
                totalElement++;

            }
            tr++;
            // rc --> tr to br
            for(int i = tr;i<=br && totalElement<r*c;i++){   
                System.out.print(arr[i][rc]+ " ");
                totalElement++;

            }
            rc--;
            // br --> rc to lc 
            for(int j = rc;j>=lc && totalElement<r*c;j--){
                System.out.print(arr[br][j]+ " ");
                totalElement++;

            }
            br--;
            // lc --> br to tr
            for(int i=br;i>=tr && totalElement<r*c;i--){
                System.out.print (arr[i][lc]+ " ");
                totalElement++;
            }
            lc++;
        }
        
    }

    static void printArray(int arr[],int i,int f){
        for(int k =i;k<f;k++)
        System.out.println(arr[k]);    
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
