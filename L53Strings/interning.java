
public class interning {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        int arr2[] = {1,2,3,4};
        arr1[0] = 23;
        DisplayArray(arr1);
        System.out.println();
        DisplayArray(arr2);
    }    
    static void DisplayArray(int a[]){
        for(int i =0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
