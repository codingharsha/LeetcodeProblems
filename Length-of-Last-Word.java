1class Solution {
2    public int lengthOfLastWord(String s) {
3        int length = 0;
4        for(int i = s.length() - 1; i >= 0; i--){
5            if(s.charAt(i) != ' '){
6                length++;
7            }
8            if(length != 0 && s.charAt(i) == ' ') break;
9        }
10
11        return length;
12    }
13}