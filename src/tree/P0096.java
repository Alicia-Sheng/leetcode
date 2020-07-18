//96. Unique Binary Search Trees

package tree;

class P0096 {
    public int numTrees(int n) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, 1);
        map.put(1, 1);
        return helper(n, map);
    }

    private int helper(int n, Map<Integer, Integer> map) {
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += helper(i - 1, map) * helper(n - i, map);
        }
        map.put(n, sum);
        return sum;
    }
}
