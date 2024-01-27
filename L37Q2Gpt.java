public class L37Q2Gpt {
    public static void main(String[] args) {
        int arr[] = {12, 3, 4, 5, 6, 3, 4, 7, 3};
        int t = 3;
        int[] ans = getAllIndex(arr, t, 0);

        System.out.println("Indexes:");
        for (int index : ans) {
            System.out.println(index);
        }
    }

    static int[] getAllIndex(int arr[], int t, int idx) {
        if (idx == arr.length) {
            // Return an empty array if no indices are found
            return new int[0];
        }

        // Recursively call getAllIndex for the next index
        int[] indices = getAllIndex(arr, t, idx + 1);

        // Check if the current element is equal to the target
        if (arr[idx] == t) {
            // Create a new array to store the current index and previously found indices
            int[] newArray = new int[indices.length + 1];
            
            // Copy the indices from the previous array
            System.arraycopy(indices, 0, newArray, 0, indices.length);
            
            // Add the current index to the new array
            newArray[indices.length] = idx;
            
            // Return the new array
            return newArray;
        } else {
            // Return the previously found indices
            return indices;
        }
    }
}
