1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        Map<Integer, Integer> map = new HashMap<>();
4        int n = numbers.length;
5        for(int i = 0; i < n; i ++){
6            int need = target - numbers[i];
7
8            if(map.containsKey(need)){
9                return new int[]{map.get(need) + 1, i + 1};
10            }
11
12            map.put(numbers[i], i);
13        }
14
15        return new int[]{};
16    }
17}