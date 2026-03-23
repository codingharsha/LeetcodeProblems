1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target){
3        int m = matrix.length;
4        int n = matrix[0].length;
5        int left = 0;
6        int right = m * n - 1;
7
8        while(left <= right){
9            int mid = left + (right - left) / 2;
10
11            int row = mid / n;
12            int col = mid % n;
13
14            int value = matrix[row][col];
15
16            if(value == target){
17                return true;
18            }
19
20            if(target > value){
21                left = mid + 1;
22            }else{
23                right = mid - 1;
24            }
25        }
26
27        return false;
28    }
29}