public class twoSum {
  public int[] twoSum(int[] numbers, int target) {
    // int[] result = new int[2];
    // for (int i = 0; i < numbers.length - 1; i++) {
    //   for (int j = i + 1; j < numbers.length; j++) {
    //     if (numbers[i] + numbers[j] == target) {
    //       result[0] = i;
    //       result[1] = j;
    //       return result;
    //     }
    //   }
    // }
    // throw new IllegalArgumentException("no two sum solution");
    // O(n^2) O(n*(n-1))
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < numbers.length; i++) {
      map.put(numbers[i], i);
    }
    for (int i = 0; i < numbers.length; i++) {
      int complement = target - numbers[i];
      if (map.containsKey(complement) && map.get(complement) != i){
        int[] result = {i, map.get(complement)};
        return result;
      }
    }
    throw new IllegalArgumentException("no two sum solution");
  }
}
