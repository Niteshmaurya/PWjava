import java.util.Arrays;

public class L16Q1 {
    public static void main(String[] args) {
        int arr[] = { 2,3,45,6,8,1,9,7,4};
        int no = 10;   
        Pairs(arr,no);
    }

    static void Pairs(int arr[],int no){
        int n = arr.length;
        int count = -1;
        for(int i =0;i<n;i++){
            for(int j = i +1;j<n;j++){
                if(arr[i] + arr[j] ==no )
                count++;
            }
        }
        System.out.println(count);
    }
}
