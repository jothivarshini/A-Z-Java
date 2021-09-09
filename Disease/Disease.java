package Disease;
import java.util.*;
public class Disease {
   private String Symptom1;
   private String Symptom2;
   private String Location;
   
   Scanner sc =new Scanner(System.in);
   
    public void input()
    {
        
        System.out.println("Enter Symptom1: ");
        Symptom1=sc.next();
        System.out.println("Enter Symptom2: ");
        Symptom2=sc.next();
    }
    
    public void Conditions()
    {
        if(Symptom1.toLowerCase().equals("fever")&& Symptom2.toLowerCase().equals("headache"))
        {
            System.out.println("Dolo650 for 3 days (1-1-1)");
        }
        else if(Symptom1.toLowerCase().equals("cold")&& Symptom2.toLowerCase().equals("cough"))
        {
            System.out.println("CofStop Syrup 5ml 3 times a day");
        }
        else
        {
            System.out.println("Enter Location: ");
            Location=sc.next();
            Hospitals();
        }
    }
    
    public void Hospitals()
    {
        if(Location.toLowerCase().equals("chennai"))
        {
            System.out.println("Nearest Hospital is New Life");
        }
        else if(Location.toLowerCase().equals("bangalore"))
        {
            System.out.println("Nearest Hospital is Rainbow Hospitals");
        }
        else if(Location.toLowerCase().equals("mumbai"))
        {
            System.out.println("Nearest Hospital is Apollo Hospitals");
        }
        else if(Location.toLowerCase().equals("delhi"))
        {
            System.out.println("Nearest Hospital is ABC Hospitals");
        }
        
    }
    
    public static void main(String[]args)
    {
        Disease ob=new Disease();
        ob.input();
        ob.Conditions();
           
    }
}

  
