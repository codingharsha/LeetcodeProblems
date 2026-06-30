1class Solution {
2    public int majorityElement(int[] nums) {
3        int result = 0;
4        HashMap<Integer,Integer> freq = new HashMap<>();
5
6        for(int num: nums){
7            freq.put(num, freq.getOrDefault(num, 0) + 1);
8        }
9
10        int n = (int)Math.abs(nums.length / 2);
11
12        for(Map.Entry<Integer, Integer> entry: freq.entrySet()){
13            if(entry.getValue() > n) {
14                result = entry.getKey();
15            }
16        }
17        return result;
18
19    }
20}