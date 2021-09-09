package TicketMachine;
import java.util.*;
public class Ticket{
    private String ticketNumber;
    private int price;
    private int total;
    private int balance;
    public int t1=200;
    public int t2=400;
    public int t3=600;
    public int t4=800;
    private int amount;   
    public int paidamount;
    
    Scanner sc = new Scanner(System.in);
    
    public void TicketProcessing()
    {
        
        System.out.println("Enter Ticket Number:  ");
        ticketNumber=sc.next();
        amount=getPrice(ticketNumber);
        
        Formatter f= new Formatter();
        f.format("The price to be paid is %d",amount);
        System.out.println(f.toString());   
    }
    
    public int getPrice(String ticketNumber)
    {
      if(ticketNumber.equals("t1"))
        {
            amount=t1;
        }
        else if(ticketNumber.equals("t2"))
        {
            amount=t2;
        }
        else if(ticketNumber.equals("t3"))
        {
            amount=t3;
        }
        else if(ticketNumber.equals("t4"))
        {
            amount=t4;
        }
      
      return amount;
    }
    
    public void insertMoney()
    {
        System.out.println("Enter the amount to be paid: ");
        paidamount=sc.nextInt();  
    }
    
    public int getBalance()
    {
        if(paidamount>amount)
        {
            balance=paidamount-amount;
        }
        return balance;
    }
    
    public void printTicket()
    {
        Formatter t= new Formatter();
        t.format("The ticket number is %s",ticketNumber);
        System.out.println(t.toString());   
        
        Formatter b= new Formatter();
        b.format("Balance amount is: %s",balance);
        System.out.println(b.toString());
    }
    
    public static void main(String[] args)
    {
       Ticket ob= new Ticket();
       ob.TicketProcessing();
       ob.insertMoney();
       ob.getBalance();
       ob.printTicket();
    }
}
