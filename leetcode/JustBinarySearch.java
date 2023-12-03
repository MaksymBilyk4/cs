public class JustBinarySearch {
    public static void main(String[] args) {

        int[] arr = {1, 10, 11, 12, 100, 101, 238, 239, 300};
        int element = 12;

        System.out.println(binarySearch(arr, element));
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (target > arr[mid]) start = mid + 1;
            else if (target < arr[mid]) end = mid - 1;
            else if (arr[mid] == target) {
                index = mid;
                break;
            }
        }

        return index;
    }
}
