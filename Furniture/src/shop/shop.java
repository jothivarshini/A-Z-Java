package shop;
import Customer.*;
import java.util.*;
public class shop extends Customer
{
    public int chair;
    public int sofa;
    public int table;
    public int money;
    
    public shop()
    {
        chair=3;
        sofa=3;
        table=3;
    }
    
    public void search()
    {
        Scanner sc= new Scanner(System.in);
        if(order.equals("chair"))
        {
            System.out.println("item available with cost 2500");
            chair=chair-no;
        }
        else if(order.equals("sofa"))
        {
            System.out.println("item available with cost 5500");
            sofa=sofa-no;
        }
        else if(order.equals("table"))
        {
            System.out.println("item available with cost 7500");
            table=table-no;
        }
        
        System.out.println("Enter money: ");
        money=sc.nextInt();
        call();
    }
    
    public void call()
    {
        if(chair<=0)
        {
            System.out.println("resupply done");
            chair=3;
        }
        else if(sofa<=0)
        {
            System.out.println("resupply done");
            sofa=3;
        }
        else if(table<=0)
        {
            System.out.println("resupply done");
            table=3;
        }
    }
}

