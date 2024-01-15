import java.util.*;     

public class L14Q3 {
    public static void main(String[] args) {
        int arr[] = {23,453,75,234,23,465,55};
        int index = searchElem2(arr, 55);

        if(index !=-1){
            System.out.println("index of 55 is "+index);
        }
        else
        System.out.println("elements not found");      
       
    }
    
    static int searchElem2(int []arr,int s){
        int i;
        for(i=0;i<arr.length;i++){
            if(s == arr[i])
            return i;
        }
        return -1;
    }



    static int searchElem(int kar[],int search){
        int thumb =0;
        for(int num : kar){
            if(search == num)     
            thumb = num;
        }
        return thumb;
    }
}
