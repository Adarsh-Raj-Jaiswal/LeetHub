class Solution {
    public int[][] generateMatrix(int n) {
        int [][] arr = new int[n][n];
        int top,bottom,left,right,val;
        top=0;
        left=0;
        bottom=n-1;
        right=n-1;
        val=1;
        while(true){
            for(int i=left;i<=right;i++)arr[top][i]=val++;
            top++;
            if(left>right||top>bottom)break;
            
            for(int i=top;i<=bottom;i++)arr[i][right]=val++;
            right--;
            if(left>right||top>bottom)break;
            
            for(int i=right;i>=left;i--)arr[bottom][i]=val++;  
            bottom--;
            if(left>right||top>bottom)break;
            
            for(int i=bottom;i>=top;i--)arr[i][left]=val++;
            left++;
            if(left>right||top>bottom)break;
        }
        return arr;
    }
}