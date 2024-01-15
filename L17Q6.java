import java.util.Scanner;

public class L17Q6 {
   public static void main(String[] args) {
    int arr[] = { 123,35,4657,89,34,56,23};
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the no. of queries");
    int q = sc.nextInt();
    find(arr,q);    
   }
   static void find(int arr[],int q){
    int j =1;

    while(q>0){
        Scanner sc = new Scanner(System.in);                          
        System.out.println(j++ + " :");        
        System.out.println("Enter the no. which you wanted to find");    
        int n = sc.nextInt();
        boolean ans = isNumberpresent(arr,n);      
        System.out.println(isNumberpresent(arr, n));
        q--;
    }

   }
   static boolean isNumberpresent(int arr[],int n){
    for(int i =0;i<arr.length;i++){
        if(n==arr[i])
        return true;
    }
    return false;
   }
}
