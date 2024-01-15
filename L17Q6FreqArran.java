import java.util.Scanner;

public class L17Q6FreqArran {

     public static void main(String[] args) {
        int arr [] = { 23,23,45,67,90,53,89};
        makeFreqArray(arr);
        Scanner sc = new Scanner(System.in);
        System.out.println(("Enter the no. of quaires you wanted to ask : "));
        int q = sc.nextInt();
        while (q>0) {
            System.out.println("Enter the element which you wanted to search in the array : ");
            int k = sc.nextInt();
            int ferq[] = makeFreqArray(arr);
            // find(ferq,k);
            System.out.println(find(ferq, k));
            q--;
        }
     }
     static int[] makeFreqArray(int arr[]){
        // int Farray[100005] = {};
        int []freqArray = new int[100005];
        for(int i =0;i<arr.length;i++){
            freqArray[arr[i]]++;
        }
        return freqArray;
        
     }
     static boolean find (int freqArray[],int k){
        for(int i =0;i<freqArray.length;i++){
            if(freqArray[k]>0)
            return true;
        }
        return false;
     }
}