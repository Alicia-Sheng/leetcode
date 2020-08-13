//53. Maximum Subarray
package java;

class P0053 {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int res = nums[0];
        int[] max = new int[nums.length];
        max[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max[i] = Math.max(nums[i], (nums[i] + max[i - 1]));
            res = Math.max(max[i], res);
        }
        return res;
        // if (nums == null || nums.length == 0) {
        //     return 0;
        // }
        // int res = nums[0];
        // int temp = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i; j < nums.length; j++) {
        //         temp += nums[j];
        //         if (temp > res) {
        //             res = temp;
        //         }
        //     }
        //     temp = 0;
        // }
        // return res;
    }
}
