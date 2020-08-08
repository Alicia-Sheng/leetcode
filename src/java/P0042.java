//42. Trapping Rain Water

package java;

class P0042 {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int res = 0;
        int length = height.length;
        int[] left = new int[length];
        left[0] = height[0];
        int[] right = new int[length];
        right[length - 1] = height[length - 1];
        for (int i = 1; i < length; i++) {
            left[i] = Math.max(height[i], left[i - 1]);
        }
        for (int i = length - 2; i > -1; i--) {
            right[i] = Math.max(height[i], right[i + 1]);
        }
        for (int i = 0; i < length; i++) {
            res += Math.min(left[i], right[i]) - height[i];
        }
        return res;
    }
}
