1class Solution {
2    static int minEatingSpeed(int piles[], int h){
3        int left = 1;
4        int right = max(piles);
5        int ans = right;
6
7        while (left <= right){
8            int mid = left + (right - left) / 2;
9            if(canFinish(piles, h, mid)){
10                ans = mid;
11                right = mid - 1;
12            }
13            else{
14                left = mid + 1;
15            }
16        }
17        return ans;
18    }
19
20    static boolean canFinish(int[] piles, int h, int k){
21        long hours = 0;
22        for(int num: piles){
23            hours += (num + k -1) / k;
24        }
25
26        return hours <= h;
27    }
28
29    static int max(int piles[]){
30        int max = 0;
31        for(int num: piles){
32            max = Math.max(max, num);
33        }
34
35        return max;
36    }
37}