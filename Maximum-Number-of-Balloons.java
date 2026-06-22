1class Solution {
2    public int maxNumberOfBalloons(String text) {
3        int[] freq = new int[26];
4
5        for(char c: text.toCharArray()){
6            freq[c - 'a']++;
7        }
8
9        int b = freq['b' - 'a'];
10        int a = freq['a' - 'a'];
11        int l = freq['l' - 'a'] / 2;
12        int o = freq['o' - 'a'] / 2;
13        int n = freq['n' - 'a'];
14
15        int[] arr = {b, a, l, o, n};
16        int min = Integer.MAX_VALUE;
17
18        for(int num: arr){
19            min = Math.min(num, min);
20        }
21
22        return min;
23    }
24
25}