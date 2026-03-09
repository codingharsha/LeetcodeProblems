1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        List<List<Integer>> result = new ArrayList<>();
4        Arrays.sort(nums);
5        for(int i = 0; i < nums.length - 2; i++){
6            if(i > 0 && nums[i] == nums[i - 1]) continue;
7            
8            int left = i + 1;
9            int right = nums.length - 1;
10
11            while(left < right){
12                int sum = nums[i] + nums[left] + nums[right];
13                if(sum == 0){
14                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
15                    while(left < right && nums[left] == nums[left + 1]) left++;
16                    while(left < right && nums[right] == nums[right - 1]) right--;
17                    left++;
18                    right--;
19                }
20                else if(sum < 0){
21                    left++;
22                }else{
23                    right--;
24                }
25            }
26
27        }
28        return result;
29    }
30}