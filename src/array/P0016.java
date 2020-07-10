// 16. 3Sum Closest

package array;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int difference = Integer.MAX_VALUE;
        int closest = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int front = i + 1;
            int back;
            while (front < nums.length - 1) {
                back = front + 1;
                while (back < nums.length) {
                    int sum = nums[i] + nums[front] + nums[back];
                    int tempDifference = Math.abs(target - sum);
                    if (tempDifference < difference) {
                        difference = tempDifference;
                        closest = sum;
                    }
                    back++;
                }
                front++;
            }
        }
        return closest;
    }
}