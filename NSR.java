import java.util.*;

class NSR
{
    public static void NSR_Util(int arr[],int n)
    {
        Stack<Integer> s=new Stack<Integer>();
        
        int ans[]=new int[n];
        
        for(int i=n-1;i>=0;i--)
        {
            if(s.empty())
                ans[i]=-1;
            else if(s.peek()<arr[i])
                ans[i]=s.peek();
            else
            {
                while(!s.empty() && s.peek()>=arr[i])
                    s.pop();
                    
                if(s.empty())
                    ans[i]=-1;
                else
                    ans[i]=s.peek();
            }
            
            s.push(arr[i]);
        }
        
        Arrays.stream(arr).forEach(i-> System.out.print(i+" "));
        System.out.println();
        Arrays.stream(ans).forEach(i-> System.out.print(i+" "));
        System.out.println();
    }
}