import java.io.*;
import java.util.*;
import java.util.stream.*;
// next grater in left of element
class NGL
{
    public static void NGL_Util(int arr[],int n)
    {
        List<Integer> al=new ArrayList<>();
        Stack<Integer> stc=new Stack<>();
        
        
        for(int i=0;i<n;i++)
        {
            if(stc.empty())
                al.add(i,-1);
            else if(!stc.empty() && stc.peek()>arr[i])
                al.add(i,stc.peek());
            else if(!stc.empty() && stc.peek()<=arr[i])
            {
                while(!stc.empty() && stc.peek()<=arr[i])
                    stc.pop();
                    
                if(stc.empty())
                    al.add(i,-1);
                else
                    al.add(i,stc.peek());
            }
            
            stc.push(arr[i]);
        }
        
        display(arr);
        displayAl(al);
        
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