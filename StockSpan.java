// count of elemnts consicutively less than or equal to arr[i] for each i
import java.io.*;
import java.util.*;


class StockSpan
{
    public static void StockSpan_Util(int arr[],int n)
    {
        int ans[]=new int[n];
        Stack<Integer> s=new Stack<Integer>();
        
        for(int i=0;i<n;i++)
        {
            if(s.empty())
                ans[i]=i+1;
            else if(arr[i]<arr[s.peek()])
                ans[i]=i-s.peek();
            else
            {
                while(!s.empty() && arr[i]>=arr[s.peek()])
                    s.pop();
                    
                if(s.empty())
                    ans[i]=i+1;
                else
                    ans[i]=i-s.peek();
            }
            
            s.push(i);
        }
        
        System.out.println();
        Arrays.stream(arr).forEach(i-> System.out.print(i+" "));
        System.out.println();
        Arrays.stream(ans).forEach(i-> System.out.print(i+" "));
    }
}