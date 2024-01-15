public class L14Q1 {
    public static void main(String[] args) {
        int arr[] = { 1,2,3,6};
        int sum = 0;
        sumArray sa = new sumArray();
        System.out.println(sa.sumArra(arr));               
    }
}
 class sumArray{
    int sum = 0;
    int  sumArra(int arb[]){
        for(int num : arb){
            sum = sum + num;
        }
        // System.out.println(sum);
        return sum ;
    }
 }
