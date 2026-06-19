1class Solution {
2    public boolean isPowerOfThree(int n) {
3        if(n <= 0) return false;
4
5        while(n % 3 == 0){
6            n /= 3;
7        }
8
9        return n == 1;
10    }
11}