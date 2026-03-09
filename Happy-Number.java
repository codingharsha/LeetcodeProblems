1class Solution {
2    public boolean isHappy(int n) {
3        int slow = n;
4        int fast = n;
5        do{
6            slow = square(slow);
7            fast = square(square(fast));
8        }while(slow != fast);
9
10        return slow == 1;
11    }
12
13    public int square(int n){
14        int sum = 0;
15        while(n != 0){
16            int unit = n%10;
17            sum += (unit*unit);
18            n = n/10;
19        }
20        return sum;
21    }
22}