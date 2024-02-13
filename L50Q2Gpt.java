public class L50Q2Gpt {
    public static void main(String[] args) {
        int arr[] = {9,10,11,12,1,2,3,4,5,6,7,8};
        int t = 1;
        int index = SortRotated(arr, t);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array");
        }
    }

    static int SortRotated(int arr[], int t){
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == t) {
                return mid;
            }
            if (arr[low] <= arr[mid]) {
                if (t >= arr[low] && t < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (t > arr[mid] && t <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
