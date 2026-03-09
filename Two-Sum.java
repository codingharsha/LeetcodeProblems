1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3
4        Map<Integer, Integer> map = new HashMap<>();
5
6        for(int i = 0; i < nums.length; i++){
7            int need = target - nums[i];
8
9            if(map.containsKey(need)){
10                return new int[]{map.get(need), i};
11            }
12
13            map.put(nums[i], i);
14        }
15
16        return new int[]{};
17    }
18}