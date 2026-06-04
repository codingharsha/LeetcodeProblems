1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        Set<Integer> set = new HashSet<>();
4
5        for(int i = 0; i < nums.length; i++){
6            if(!set.contains(nums[i])){
7                set.add(nums[i]);
8            }else{
9                return true;
10            }
11        }
12
13        return false;
14    }
15}