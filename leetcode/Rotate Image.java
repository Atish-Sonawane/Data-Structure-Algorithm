//https://leetcode.com/problems/rotate-image/
// T - O(N^2) and S - O(1)
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        
        //Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
               int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        //Reverse of rows
        for(int i=0; i<n; i++){
            for(int j=0;j<n/2; j++){
                //swap the matrix[i][j]=nmatrix[i][n-j-1]
                int temp=matrix[i][j];
                matrix [i][j]= matrix[i][n-1-j];
                matrix [i][n-1-j]=temp;
            }
        }
        
    }
}
