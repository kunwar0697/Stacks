import java.io.*;
import java.util.*;
import java.util.stream.*;
// next grater in left of element
class NGR
{
    public static void NGR_Util(int arr[],int n)
    {
       // List<Integer> al=new ArrayList<>(n);
       int ans[]=new int[n]; 
       Stack<Integer> stc=new Stack<>();
        
        
        for(int i=n-1;i>=0;i--)
        {
            if(stc.empty())
                ans[i]=-1;  
            //al.add(i,-1);
            else if(!stc.empty() && stc.peek()>arr[i])
                ans[i]=stc.peek();    
            //al.add(i,stc.peek());
            else if(!stc.empty() && stc.peek()<=arr[i])
            {
                while(!stc.empty() && stc.peek()<=arr[i])
                    stc.pop();
                    
                if(stc.empty())
                    ans[i]=-1;   
                // al.add(i,-1);
                else
                    ans[i]=stc.peek();    
                //al.add(i,stc.peek());
            }
            
            stc.push(arr[i]);
        }
        
        display(arr);
        display(ans);
        //displayAl(al);
        
    }
    
    public static void display(int arr[])
    {
        System.out.println();
        Arrays.stream(arr).forEach(i-> System.out.print(i+" "));
        System.out.println();
    }
    
    public static void displayAl(List<Integer> al)
    {
        System.out.println(al);
    }
}