import java.util.Arrays;
import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 10, 6, 7, 8, 1};
        System.out.println(Arrays.toString(arr));

        System.out.println(containsDuplicateFast(arr));
//        System.out.println(containsDuplicate(arr));

    }

    // faster solution. Time -> O(n). BUT Memory -> O(n)
    static boolean containsDuplicateFast(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length - 1; i++) {
            map.put(nums[i], nums[i]);
            if (map.containsKey(nums[i + 1])) return true;
        }

        return false;
    }


    // slow solution. Time -> O(n^2). Memory -> O(1)
    static boolean containsDuplicate(int[] nums) {

        boolean includesDuplicate = false;

        for (int i = 0; i < nums.length; i++) {
            if (includesDuplicate) break;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    includesDuplicate = true;
                    break;
                }
            }

        }

        return includesDuplicate;
    }
}
