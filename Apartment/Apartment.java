package Apartment;
import java.util.*;
public class Apartment{
    public String residence_name;
    public int hansagardens=2000;
    public int jainssudarshana=3000;
    public int jayendaranagar=4000;
    public String name;
    public String block_no;
    public int flat_no;
    public int due_amt;
    public int balance;
    public String mobile_no;
    public int amountpaid;
    
    Scanner sc = new Scanner(System.in);
    
    public void Input()
    {
        System.out.println("Enter Occupant Name");
        name=sc.next();
        System.out.println("Enter Mobile Number");
        mobile_no=sc.next();
        System.out.println("Enter Residence Name");
        residence_name=sc.next();
        System.out.println("Enter Block Number");
        block_no=sc.next();
        System.out.println("Enter Flat Number");
        flat_no=sc.nextInt();  
        maintenanceCost(residence_name);
        
        Formatter f= new Formatter();
        f.format("The maintenance to be paid is %d",due_amt);
        System.out.println(f.toString());   
    }
    
    public int maintenanceCost(String residence_name)
    {
      if(residence_name.toLowerCase().equals("hansagardens"))
        {
            due_amt=hansagardens;
        }
        else if(residence_name.toLowerCase().equals("jainssudarshana"))
        {
            due_amt=jainssudarshana;
        }
        else if(residence_name.toLowerCase().equals("jayendaranagar"))
        {
            due_amt=jayendaranagar;
        }
       
      return due_amt;
    }
    
    public void payMaintenance()
    {
        System.out.println("Enter the amount to be paid: ");
        amountpaid=sc.nextInt();  
    }
      
    public int balanceAmount()
    {
        if(amountpaid>due_amt)
        {
            balance=amountpaid-due_amt;
        }
        return balance;
    }
    
       public void printBill()
    {
        Formatter r= new Formatter();
        r.format("The Residence is %s",residence_name);
        System.out.println(r.toString());
        
        Formatter n= new Formatter();
        n.format("The payee is %s",name);
        System.out.println(n.toString()); 
        
        Formatter b= new Formatter();
        b.format("Balance amount is: %s",balance);
        System.out.println(b.toString());
    }
       
    public static void main(String[] args)
    {
       Apartment ob= new Apartment();
       ob.Input();
       ob.payMaintenance();
       ob.balanceAmount();
       ob.printBill();
    }
}

        
        