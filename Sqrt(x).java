1class Solution {
2    public int mySqrt(int x) {
3        int left = 0;
4        int right = x;
5        int result = 0;
6
7        while(left <= right){
8            int mid = left + (right - left) / 2;
9            if((long) mid * mid <= x){
10                result = mid;
11                left = mid + 1;
12            }else{
13                right = mid - 1;
14            }
15        }
16        return result;
17    }
18}