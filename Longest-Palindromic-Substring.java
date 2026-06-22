1class Solution {
2    
3        int start = 0;
4        int maxLen = 0;
5
6    public String longestPalindrome(String s) {
7
8        for(int i = 0; i < s.length(); i++){
9            expand(s, i, i);
10            expand(s, i, i + 1);
11
12        }
13
14        return s.substring(start, start+maxLen);
15    }
16
17    private void expand(String s, int left, int right){
18        while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
19            left--;
20            right++;
21        }
22
23        int len = right - left - 1;
24
25        if(len > maxLen){
26            maxLen = len;
27            start = left + 1;
28        }
29    }
30}