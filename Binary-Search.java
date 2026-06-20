1class Solution {
2    public int search(int[] nums, int target) {
3        int lo = 0;
4        int hi = nums.length - 1;
5
6        while(lo <= hi){
7
8            int mid = lo + (hi - lo) / 2;
9            
10            if(nums[mid] == target) return mid;
11
12            else if(nums[mid] > target){
13                hi = mid - 1;
14            }
15
16            else{
17                lo = mid + 1;
18            }
19        }
20
21        return -1;
22
23    }
24}