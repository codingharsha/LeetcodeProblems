1class Solution {
2    public int reverse(int x) {
3        int n; 
4        int result = 0;
5        while(x != 0){
6            n = x % 10;
7            x = x / 10;
8            if(result < -2147483648 / 10 || (result == -2147483648 && n < -8)) return 0;
9            if(result > 2147483647 / 10 || (result == 2147483647 && n > 7)) return 0;
10            result = (result * 10) + n;
11        }
12        return result;
13    }
14}