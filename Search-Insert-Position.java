1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int lo = 0;
4        int hi = nums.length - 1;
5
6        while(lo <= hi){
7            int mid = lo + (hi - lo) / 2;
8            if(target == nums[mid]) return mid;
9            if(nums[mid] < target){
10                lo = mid + 1;
11            }else{
12                hi = mid - 1;
13            }
14        }
15
16        return lo;
17    }
18}