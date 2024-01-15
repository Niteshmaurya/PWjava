public class L15p2 {
    
        public static void main(String[] args) {
            int arr[] = {23,345,57,45};
            int a = 10;
            System.out.println("Before zeroing the array\n");
            System.out.println("a = "+a);
            printArray(arr);     
           changeArray(arr);
           changeVal(a);
            System.out.println("after zeroing\n");    // array change hoga kyuki wo call by reference hota hai,means it stores the array in heap memory and normal integer only stored at stack memory which is evopareted that means deleted after some time 
            printArray(arr);
            System.out.println("a is "+a);
    
            
        }
        static void printArray(int arr[]){
            for(int i = 0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
            System.out.println("\n");
        }
    
        static void changeArray(int arr[]){
            for(int i=0;i<arr.length;i++){
                arr[i] = 0;
            }
        }
        static void changeVal(int a){
            a = 0;
        }
    }
    

