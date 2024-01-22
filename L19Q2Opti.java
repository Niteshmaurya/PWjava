import java.util.Scanner;

public  class L19Q2Opti {       // for optimization we will go with the prefix sum method 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array ");   
        int ln = sc.nextInt();
        int arr[] = new int[ln+1];

        for(int i =1;i<=ln;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the no. of queries : ");
        int q = sc.nextInt();


        prefixSum(arr);     
        while(q>0){
        int l,r;
        System.out.println("enter the values of l and r");
        l = sc.nextInt();
        r = sc.nextInt();
        int sum =0;
        sum = arr[r] - arr[l-1];    
        System.out.println("Sum is " +sum);
        q--;
    }
    System.out.println("thank you ");
    }

    static void prefixSum(int arr[]){
        int n = arr.length;
        for(int i =1;i<n;i++){
            arr[i] = arr[i]+ arr[i-1];
        }
        for(int k =0;k<n;k++){
            System.out.print(" "+arr[k]);
        }
        System.out.println("\n");  
    }
}
