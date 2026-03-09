1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int slow = 0;
4        for(int fast = 1; fast < nums.length; fast++){
5            if(nums[fast] != nums[slow]){
6                slow++;
7                nums[slow] = nums[fast];
8            }
9        }
10
11        return slow + 1;
12    }
13}