//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    public void func(int index,ArrayList<Integer>ds,ArrayList<Integer>list,ArrayList<Integer>arr,int N){
        if(index>=N){
            int num=0;
            for(int i=0;i<ds.size();i++)num+=ds.get(i);
            list.add(num);
            return;
        }
        ds.add(arr.get(index));
        func(index+1,ds,list,arr,N);
        ds.remove(ds.size()-1);
        func(index+1,ds,list,arr,N);
    }
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        func(0,new ArrayList<Integer>(),res,arr,N);
        return res;
        
    }
}