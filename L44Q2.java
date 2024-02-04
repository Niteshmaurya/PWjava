public class L44Q2 {
    public static void main(String[] args) {
        String arr[] = {"apple","kiwi","papaya","lime","watermelon","mango"};
        int n =arr.length;
        sortFruits(arr,n);
        for(String val : arr)
        System.out.print(val+ " ");  
    }
    static void sortFruits(String arr[],int n){
        for(int i=0;i<n-1;i++){
            int min_index = i;
            for(int j =i+1;j<n;j++){
                if(arr[j].compareTo(arr[min_index])<0){
                    min_index = j;
                }
            }
            // swaps of minindex,i;
            String temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
    
}
