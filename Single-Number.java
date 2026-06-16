1class Solution {
2    public int singleNumber(int[] nums) {
3        int result = 0;
4        for(int num: nums){
5            result ^= num;
6        }
7
8        return result;
9    }
10}