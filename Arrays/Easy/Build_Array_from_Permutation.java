package code.deepjyoti.Arrays.Easy;

//    https://leetcode.com/problems/build-array-from-permutation/
//    1920. Build Array from Permutation

import java.util.Arrays;

public class Build_Array_from_Permutation {
//    Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

//    A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
//
//
//
//    Example 1:
//
//    Input: nums = [0,2,1,5,3,4]
//    Output: [0,1,2,4,5,3]
//    Explanation: The array ans is built as follows:
//    ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
//            = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
//            = [0,1,2,4,5,3]
//
//    Example 2:
//
//    Input: nums = [5,0,1,2,3,4]
//    Output: [4,5,0,1,2,3]
//    Explanation: The array ans is built as follows:
//    ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
//            = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
//            = [4,5,0,1,2,3]
//
//
//
//    Constraints:
//
//            1 <= nums.length <= 1000
//            0 <= nums[i] < nums.length
//    The elements in nums are distinct.

    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};

        System.out.println(Arrays.toString(buildArray(nums)));
    }

    public static int[] buildArray(int[] nums) {

        int n = nums.length;

        int[] ans = new int[n];

        for(int i = 0; i< n; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;

//        int n = nums.length;
//
//        for(int i=0; i<n; i++){
//            // this is done to keep both old and new value together.
//            // going by the example of [5,0,1,2,3,4]
//            // after this nums[0] will be 5 + 6*(4%6) = 5 + 24 = 29;
//            // now for next index calulation we might need the original value of num[0] which can be obtain by num[0]%6 = 29%6 = 5;
//            // if we want to get just the new value of num[0], we can get it by num[0]/6 = 29/6 = 4
//            nums[i] = nums[i] + n*(nums[nums[i]] % n);
//        }
//
//        for(int i=0; i<n; i++){
//            nums[i] = nums[i]/n;
//        }
//
//        return nums;
    }
}






