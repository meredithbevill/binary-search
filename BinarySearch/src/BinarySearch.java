public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            
            if (arr[mid] == target) {
                return mid;
            }

           
            if (arr[mid] < target) {
                low = mid + 1;
            }
            
            else {
                high = mid - 1;
            }
        }

        // Return -1 if the target is not found
        return -1;
    }

    public static void main(String[] args) {
        // Replace this with your own sorted data
        int[] myArray = {11, 12, 22, 25, 34, 64, 90};
        int target = 22;

        System.out.print("Sorted Array: ");
        for (int num : myArray) {
            System.out.print(num + " ");
        }

        int result = binarySearch(myArray, target);

        if (result != -1) {
            System.out.println("\nTarget " + target + " found at index: " + result);
        } else {
            System.out.println("\nTarget " + target + " not found in the array.");
        }
    }
}
