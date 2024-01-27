import java.io.*;
public class L32Q1 {
    public static void main(String[] args) {
        int arr[] = { 1,2,3,45,76};
        int l =  arr.length;
        printArr(arr,l);
    }
    static int printArr(int arr[],int l){
        if(l==1){
            System.out.print(arr[l-1]+" ");  
            return 0;
        }
        else{
            printArr(arr, l-1);
            System.out.print(arr[l-1]+" ");
        }
        return 0;


    }
}
