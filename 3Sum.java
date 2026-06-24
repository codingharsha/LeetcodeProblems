1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        Arrays.sort(nums);
4        List<List<Integer>> result = new ArrayList<>();
5
6
7        for(int i = 0; i < nums.length - 2; i++){
8            if(i > 0 && nums[i] == nums[i - 1]) continue;
9            int left = i + 1;
10            int right = nums.length - 1;
11            int n = nums[i];
12            int need = -n;
13
14            while(left < right){
15                if(nums[left] + nums[right] < need){
16                    left++;
17                }else if(nums[left] + nums[right] > need){
18                    right--;
19                }else{
20                    result.add(Arrays.asList(n, nums[left], nums[right]));
21                    left++;
22                    right--;
23
24                    while(left < right && nums[left] == nums[left - 1]){
25                        left++;
26                    }
27
28                    while(left < right && nums[right] == nums[right + 1]){
29                        right--;
30                    }
31                }
32            }
33        }
34
35        return result;
36    }
37}