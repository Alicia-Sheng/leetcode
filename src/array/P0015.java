// 15. 3Sum

package array;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class P0015 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int front = i + 1;
                int back = nums.length - 1;
                int sum = 0 - nums[i];
                while (front < back) {
                    if (nums[front] + nums[back] == sum) {
                        result.add(Arrays.asList(nums[i], nums[front], nums[back]));
                        while (front < back && nums[front] == nums[front + 1]) {
                            front++;
                        }
                        while (front < back && nums[back] == nums[back - 1]) {
                            back--;
                        }
                        front++;
                        back--;
                    } else if (nums[front] + nums[back] > sum) {
                        back--;
                    } else {
                        front++;
                    }
                }
            }
        }
        return result;
    }
}
