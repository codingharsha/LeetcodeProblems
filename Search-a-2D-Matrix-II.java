1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5
6        int row = 0;
7        int col = n - 1;
8
9        while(row < m && col >= 0){
10            int curr = matrix[row][col];
11
12            if(curr == target) return true;
13            else if(curr > target) col --;
14            else row++;
15        }
16
17        return false;
18    }
19}