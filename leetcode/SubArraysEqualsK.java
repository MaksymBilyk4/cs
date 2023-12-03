import java.util.HashMap;

public class SubArraysEqualsK {

    // [7, 2, -5, 1, 1, -1, 5, -5], k = 5
    // find all sub arrays that equals in sum to k

    public static void main(String[] args) {
        int[] arr = {7, 2, -5, 1, 1, -1, 5, -5};
        System.out.println(subArraySumCount(arr, 5));
        System.out.println(subArraysSumCountFaster(arr, 5));
    }


    // Time -> O(n). Mem -> O(n)
    static int subArraysSumCountFaster(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();


        // if we will have our difference = 0, that means that sum of subarray equals to k
        map.put(0, 1);

        int subarraySum = 0;
        int removeDifference;
        int prevSumCount;
        int kCounter = 0;

        // put sum in map (key - sum, value - count of sum)
        // subtract -> subarraySum - k ===> difference
        // find this difference as key in Map and if this difference exist in map we need to do kCounter += 1;
        // 4 2 2 1 2 -3 5, k = 5
        // 4 -> 1
        // 6 -> 1
        // 8 -> 1
        // 9 -> 1
        // subarraySum = 9, difference = subarraySum - k -> 4; map.get(4) != null ? kCounter+= 1 : kCounter += 0

        for (int i = 0; i < arr.length; i++) {

            // add subarray sum
            subarraySum += arr[i];

            // find the difference between sum and k, to find this value in the map and decide is there sum of k or not
            removeDifference = subarraySum - k;

            // if in map we have removeDifference key (as a previous sum)
            kCounter += map.get(removeDifference) != null ? map.get(removeDifference) : 0;

            // if we had the same sum in our map before
            prevSumCount = map.get(subarraySum) != null ? map.get(subarraySum) : 0;

            map.put(subarraySum, prevSumCount + 1);
        }
        System.out.println(map);
        return kCounter;
    }

    // Time -> O(n^2). Mem -> O(1)
    static int subArraySumCount (int[] arr, int k) {
        int kCounter = 0;
        int sum;

        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) kCounter += 1;
            }
        }

        return kCounter;
    }
}
