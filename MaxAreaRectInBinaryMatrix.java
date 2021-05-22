import java.util.*;
import java.io.*;


class MaxAreaRectInBinaryMatrix
{
    public static void getMaxArea(int arr[][],int n)
    {
        int hist[]=new int[n];
        int max=0;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]!=0)
                hist[j]+=arr[i][j];
                else hist[j]=0;
            }   
            int temp_area=MAH.getMAH(hist,n);
            
            max=max>temp_area?max:temp_area;
        }
        
        
        System.out.println(max);
    }

}