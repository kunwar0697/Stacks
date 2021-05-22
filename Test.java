public class Test
{
    public static void subsets(String ip,String op)
    {
        if(ip.length()==0)
        {
            System.out.println(op);
            return;
        }
        
        String x=op;
        String y=op;
        
        y=y+ip.charAt(0);
        
        subsets(ip.substring(1),x);
        subsets(ip.substring(1),y);
    }
}