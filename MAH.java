import java.util.*;
import java.io.*;

class MAH
{
// MAXIMUM AREA OF HISTOGRAM
    public static void MAH_Util(int arr[],int n)
    {
        int left[]=new int[n];
        int right[]=new int[n];
        int expand[]=new int[n];
        
        Stack<Integer> s=new Stack<Integer>();
        
        
        for(int i=0;i<n;i++)
        {
            if(s.empty())
                left[i]=-1;
            else if(arr[i]>arr[s.peek()])
                left[i]=s.peek();
            else
            {
                while(!s.empty() && arr[i]<=arr[s.peek()])
                    s.pop();
                    
                if(s.empty())
                    left[i]=-1;
                else
                    left[i]=s.peek();
            }
            
            s.push(i);
        }
        
        s.clear();
        
        for(int i=n-1;i>=0;i--)
        {
            if(s.empty())
                right[i]=n;
            else if(arr[s.peek()]<arr[i])
                right[i]=s.peek();
            else
            {
                while(!s.empty() && arr[i]<=arr[s.peek()])
                    s.pop();
                    
                if(s.empty())
                    right[i]=n;
                else
                    right[i]=s.peek();
            }
            
            s.push(i);
        }
        int max=0;
        int t=0;
        for(int i=0;i<n;i++)
        {
            expand[i]=right[i]-left[i]-1;
            t=arr[i]*expand[i];
            max=max>t?max:t;
        }
        
        System.out.println();
        Arrays.stream(arr).forEach(i-> System.out.print(i+"   "));
        System.out.println();
        Arrays.stream(left).forEach(i-> System.out.print(i+"   "));
        System.out.println();
        Arrays.stream(right).forEach(i-> System.out.print(i+"   "));
        System.out.println();
        Arrays.stream(expand).forEach(i-> System.out.print(i+"   "));
        System.out.println();
        System.out.println(max);
    }
    
    public static int getMAH(int arr[],int n)
    {
        int left[]=new int[n];
        int right[]=new int[n];
        int expand[]=new int[n];
        
        Stack<Integer> s=new Stack<Integer>();
        
        
        for(int i=0;i<n;i++)
        {
            if(s.empty())
                left[i]=-1;
            else if(arr[i]>arr[s.peek()])
                left[i]=s.peek();
            else
            {
                while(!s.empty() && arr[i]<=arr[s.peek()])
                    s.pop();
                    
                if(s.empty())
                    left[i]=-1;
                else
                    left[i]=s.peek();
            }
            
            s.push(i);
        }
        
        s.clear();
        
        for(int i=n-1;i>=0;i--)
        {
            if(s.empty())
                right[i]=n;
            else if(arr[s.peek()]<arr[i])
                right[i]=s.peek();
            else
            {
                while(!s.empty() && arr[i]<=arr[s.peek()])
                    s.pop();
                    
                if(s.empty())
                    right[i]=n;
                else
                    right[i]=s.peek();
            }
            
            s.push(i);
        }
        int max=0;
        int t=0;
        for(int i=0;i<n;i++)
        {
            expand[i]=right[i]-left[i]-1;
            t=arr[i]*expand[i];
            max=max>t?max:t;
        }
        
        
        return max;
    }


}