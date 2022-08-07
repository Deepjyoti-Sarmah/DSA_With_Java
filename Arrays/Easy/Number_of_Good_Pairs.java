package code.deepjyoti.Arrays.Easy;

public class Number_of_Good_Pairs {

//    https://leetcode.com/problems/number-of-good-pairs/
//    1512. Number of Good Pairs

//    Given an array of integers nums, return the number of good pairs.
//
//            A pair (i, j) is called good if nums[i] == nums[j] and i < j.

//    Example 1:
//    Input: nums = [1,2,3,1,1,3]
//    Output: 4
//    Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
//
//            Example 2:
//
//    Input: nums = [1,1,1,1]
//    Output: 6
//    Explanation: Each pair in the array are good.
//
//            Example 3:
//
//    Input: nums = [1,2,3]
//    Output: 0
//
//
//
//    Constraints:
//
//            1 <= nums.length <= 100
//            1 <= nums[i] <= 100



    public static void main(String[] args) {

        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }

    public static int numIdenticalPairs(int[] nums) {

//        Method - 1: We can use two for loops and check is nums[i] = nums[j] and i < j and simply increase count by one every time.
//        int ans = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (nums[i] == nums[j] && i < j ){
//                    ans ++;
//                }
//            }
//        }
//
//        return ans;

//        Method - 2 : First we can count the frequency of each number using array. If a number appears n times, then n * (n – 1) / 2 pairs can be made with this number.

        int ans = 0;

        int[] count = new int[101];

        for (int n : nums) {
            count[n]++;
        }

        for (int n : count) {
            ans += (n * (n - 1))/2;
        }

        return ans;
    }

}
