1class Solution {
2    public boolean isPowerOfTwo(int n) {
3        if(n > 0 && (n & (n - 1)) == 0) return true;
4
5        return false;
6    }
7}