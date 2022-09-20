class Solution {
     static int count;
     static int [][]res;
    public static void add(int i,int j,int rows,int cols){
        if(i<0||j<0||i>=rows||j>=cols)return;
        res[count][0]=i;
        res[count][1]=j;
        count++;
    }
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        res= new int[rows*cols][2];
        count=0;
        int len=1;
        while(count<(rows*cols)){
            for(int i=0;i<len;i++)add(rStart,cStart++,rows,cols);
            for(int i=0;i<len;i++)add(rStart++,cStart,rows,cols);
            len++;
            for(int i=0;i<len;i++)add(rStart,cStart--,rows,cols);
            for(int i=0;i<len;i++)add(rStart--,cStart,rows,cols);
            len++;
        }
        return res;
    }
}