package Customer;
import java.util.*;
public class Customer
{
    public String name;
    public String order;
    public int no;
    
    public void input()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Name: ");
        name=sc.next();
        System.out.println("Order: ");
        order=sc.next();
        System.out.println("Number: ");
        no=sc.nextInt();
        
    }
}