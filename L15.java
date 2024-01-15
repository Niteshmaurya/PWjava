import java.util.Arrays;

public class L15 {
    // printArray();
    public static void main(String[] args) {
        int arr[] = {23,345,57,45};
        System.out.println("Before coping the array\n");
        printArray(arr);     

        // int arr_2[] = arr;    //---> this is shallow copy
           // in this shallow copy happens that means arr1 and arr2 both references at same adress of array thats why we are not able to change the value of arr2 only that means changes are also occuring in arr1 also 

        //    int arr_2[] = arr.clone();    // --->this is deep copy    both aray get diff heap memory

        // int arr_2[] = Arrays.copyOf(arr,arr.length);
        int arr_2[] = Arrays.copyOfRange(arr, 0, arr.length);
        System.out.println(("After coping the array\n"));
        printArray(arr_2);  


        arr_2[0] = 0;
        arr_2[1] = 0;
        System.out.println("org array after changing \n");
        printArray(arr);
        System.out.println("arr_2 after changing  the value\n ");
        printArray(arr_2);     
    }
    static void printArray(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(" "+arr[i]);     
        }
        System.out.println("\n");
    }

    static void changeArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i] = 0;
        }
    }
}
