package furniture;
import shop.*;
public class Furniture extends shop {
    
    public int amount;
    public int balance;
    
    public void results()
    {
        if(order.equals("chair"))
        {
            amount=200*no;
            System.out.println("amount to be paid is: " + amount);
            balance = money - amount;
            if(balance<0)
                balance*=-1;
            System.out.println("balance amount is: " + balance);   
        }
        
        else if(order.equals("sofa"))
        {
            amount=200*no;
            System.out.println("amount to be paid is: " + amount);
            balance = money - amount;
            if(balance<0)
                balance*=-1;
            System.out.println("balance amount is: " + balance);   
        }
        
         else if(order.equals("table"))
        {
            amount=200*no;
            System.out.println("amount to be paid is: " + amount);
            balance = money - amount;
            if(balance<0)
                balance*=-1;
            System.out.println("balance amount is: " + balance);   
        }
    }
    
    public static void main(String[] args)
    {
        System.out.println("Welcome to Fair Deal Furnitures!\n");
        Furniture ob = new Furniture();
        ob.input();
        ob.search();
        ob.results();
        
    }
    
}
    

