//42. Trapping Rain Water

package java;

class P0042 {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int res = 0;
        int[] left = new int[height.length];
        left[0] = height[0];
        int[] right = new int[height.length];
        right[height.length - 1] = height[height.length - 1];
        for (int i = 1; i < height.length; i++) {
            left[i] = Math.max(height[i], left[i - 1]);
        }
        for (int j = height.length - 2; j > -1; j--) {
            right[j] = Math.max(height[j], right[j + 1]);
        }
        for (int i = 0; i < height.length; i++) {
            res += Math.min(left[i], right[i]) - height[i];
        }
        return res;
    }
}
