// 11. Container With Most Water

package array;

class P0011 {
    public int maxArea(int[] height) {
//        int maxArea = 0;
//        for (int i = 0; i < height.length - 1; i++) {
//            for (int j = i + 1; j < height.length; j++) {
//                int area = Math.min(height[i], height[j]) * (j - i);
//                if (area > maxArea) {
//                    maxArea = area;
//                }
//            }
//        }
//        return maxArea;
        int i = 0;
    	int j = height.length - 1;
    	int maxArea = 0;
    	for (int a = 0; a < height.length; a++) {
    		maxArea = Math.max(Math.min(height[i], height[j]) * (j - i), maxArea);
    		if (height[i] < height[j]) {
    			i++;
    		} else {
    			j--;
    		}
            if (i >= j) {
    			break;
    		}
    	}
    	return maxArea;
    }
}
