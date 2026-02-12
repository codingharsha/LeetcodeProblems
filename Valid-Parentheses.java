1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> st = new Stack<>();
4
5        for(char ch : s.toCharArray()){
6            if(ch == '{' || ch == '(' || ch == '['){
7                st.push(ch);
8            }
9            else{
10                if(st.isEmpty()) return false;
11                char top = st.pop();
12                if(ch == '}' && top != '{' || ch == ')' && top != '(' || ch == ']' && top != '[') return false;
13            }
14        }
15
16        return st.isEmpty();
17    }
18}