import java.io.*;
import java.util.*;


class NSL
{
    public static void NSL_Util(int arr[],int n)
    {
        Stack<Integer> stc=new Stack<Integer>();
        
        int ans[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            if(stc.empty())
                ans[i]=-1;
                
            else if(stc.peek()<arr[i])
                ans[i]=stc.peek();
                
            else
            {
                while(!stc.empty() && stc.peek()>=arr[i])
                    stc.pop();
                    
                if(stc.empty())
                    ans[i]=-1;
                else
                    ans[i]=stc.peek();
            }
            
            stc.push(arr[i]);
        }
        
        Arrays.stream(arr).forEach(i-> System.out.print(i+" "));
        System.out.println();
        Arrays.stream(ans).forEach(i-> System.out.print(i+" "));
        
    }
}