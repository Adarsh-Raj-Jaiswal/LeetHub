class Solution {
    public int maxArea(int[] h) {
        int i,j;
        int area,width,height,max;
        i=0;
        j=h.length-1;
        max=0;
        while(i<j){
            width=j-i;
            height=Math.min(h[i],h[j]);
            area=width*height;
            max=Math.max(max,area);
            if(h[i]<h[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}