import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {24,5,7,6};
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the value of  index : " +i);
            arr[i] = sc.nextInt();
        }
        for(int num : arr){
            System.out.print(num );
        }
    
    
    }

}
