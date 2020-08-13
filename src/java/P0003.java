//3. Longest Substring Without Repeating Characters

package java;

class P0003 {
    public int lengthOfLongestSubstring(String s) {
        int p1 = 0;
        int p2 = 0;
        int res = 0;
        HashSet<Character> set = new HashSet();
        while (p2 < s.length()) {
            if (!set.contains(s.charAt(p2))) {
                set.add(s.charAt(p2));
                p2++;
                res = Math.max(res, set.size());
            } else {
                set.remove(s.charAt(p1));
                p1++;
            }
        }
        return res;
    }
}
