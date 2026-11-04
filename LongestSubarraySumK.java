import java.util.HashMap;

public class LongestSubarraySumK {

    public static int longestSubarray(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLength = 0;

        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (map.containsKey(sum - k)) {
                int length = i - map.get(sum - k);
                maxLength = Math.max(maxLength, length);
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

        int[] nums = {1, -1, 5, -2, 3};
        int k = 3;

        System.out.println(longestSubarray(nums, k));
    }
}