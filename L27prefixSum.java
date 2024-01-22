import java.util.Scanner;

public class L27prefixSum {
    static int ln;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[] = { 1, 23, 4, 5, 6, 7, 8, 5 };
        
        int arr[] = GetPrefixSum( arr1);
        printArray(arr);
        int sum = GetSum(arr);
        System.out.println(sum);

    }
    static int GetSum(int arr[]){
        System.out.println("Enter the value of l and r ");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int sum = arr[r]-arr[l-1];          // this is optimized method to take prefixSum
        return sum;
    }

    static int[] GetPrefixSum( int arr[]) {
        for (int i = 1; i < arr.length; i++) {    
            arr[i] = arr[i] + arr[i - 1];
        }
        return arr;
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
