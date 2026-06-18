1class Solution {
2    public boolean isPalindrome(String s) {
3        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
4
5        int left = 0;
6        int right = s.length() - 1;
7
8        while(left < right){
9            if(s.charAt(left) != s.charAt(right)) return false;
10
11            left++;
12            right--;
13        }
14
15        return true;
16    }
17}