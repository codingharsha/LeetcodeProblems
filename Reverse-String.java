1class Solution {
2    public void reverseString(char[] s) {
3        int i = 0;
4        int j = s.length - 1;
5        char temp;
6        while(i < j){
7            temp = s[i];
8            s[i] = s[j];
9            s[j] = temp;
10
11            i++;
12            j--;
13        }
14    }
15}