//973. K Closest Points to Origin

package java;

class P0973 {
    public int[][] kClosest(int[][] points, int K) {
        double[] distance = new double[points.length];
        int[][] res = new int[K][2];
        for (int i = 0; i < points.length; i++) {
            int[] point = points[i];
            distance[i] = Math.sqrt(point[0] * point[0] + point[1] * point[1]);
        }
        Arrays.sort(distance);
        int position = 0;
        for (int i = 0; i < points.length; i++) {
            int[] point = points[i];
            double dis = Math.sqrt(point[0] * point[0] + point[1] * point[1]);
            if (dis <= distance[K - 1]) {
                res[position] = points[i];
                position++;
            }
        }
        return res;
    }
}
