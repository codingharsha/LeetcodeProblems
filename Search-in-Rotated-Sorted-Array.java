1class Solution {
2    public int search(int nums[], int target){
3        int left = 0;
4        int right = nums.length - 1;
5
6        while(left <= right){
7            int mid = left + (right - left) /2;
8            if(target == nums[mid]) return mid;
9            if(nums[left] <= nums[mid]){
10                if(target >= nums[left] && target < nums[mid]){
11                    right = mid - 1;
12                }else{
13                    left = mid + 1;
14                }
15            }else{
16                if(target > nums[mid] && target <= nums[right]){
17                    left = mid + 1;
18                }else {
19                    right = mid - 1;
20                }
21            }
22        }
23
24        return -1;
25    }
26}