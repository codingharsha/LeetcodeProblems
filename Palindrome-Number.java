1class Solution {
2    public boolean isPalindrome(int x) {
3        String s = Integer.toString(x);
4        String rev = new StringBuilder(s).reverse().toString();
5        if(s.equals(rev)) return true;
6        else return false;
7    }
8}