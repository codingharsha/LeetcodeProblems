1class Solution {
2    public int romanToInt(String s) {
3        HashMap<Character, Integer> roman = new HashMap<>();
4        roman.put('I', 1);
5        roman.put('V', 5);
6        roman.put('X', 10);
7        roman.put('L', 50);
8        roman.put('C', 100);
9        roman.put('D', 500);
10        roman.put('M', 1000);
11
12        int result = 0;
13        for(int i = 0; i < s.length(); i++){
14            int curr = roman.get(s.charAt(i));
15
16            if(i+1 <  s.length() &&  curr < roman.get(s.charAt(i + 1))){
17                result -= curr;
18            }
19
20            else{
21                result += curr;
22            }
23
24        }
25            return result;
26    }
27}