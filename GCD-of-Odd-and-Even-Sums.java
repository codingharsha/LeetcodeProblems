1class Solution {
2    public int gcdOfOddEvenSums(int n) {
3        int a = sumOdd(n);
4        int b = sumEven(n);
5        return gcd(a,b);
6    }
7
8    public int sumOdd(int m){
9        return m*m;
10    }
11
12    public int sumEven(int m){
13        return m*(m + 1);
14    }
15
16    public int gcd(int a, int b){
17        while(b != 0){
18        int temp = b;
19        b = a % b;
20        a = temp;
21        }
22        return a;
23    }
24}