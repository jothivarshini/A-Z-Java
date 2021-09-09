package Household;
import java.util.*;
public class Household{
    public String name;
    public int members;
    public int income;
    public String id;
    public int household_t[]=new int[20];
    public String household_n[]=new String[20];
    public int average;
    public int sum=0;
    public double poverty=0;
    public int count=0;
    public int percentage;
    Scanner sc = new Scanner(System.in);
    
    public void Input()
    {
        System.out.println("Enter Number of Members");
        members=sc.nextInt();
        for(int i=0;i<members;i++)
        {
        System.out.println("Enter Name");
        name=sc.next();
        System.out.println("Enter Income");
        income=sc.nextInt();
        System.out.println("Enter ID");
        id=sc.next();  
        
        household_t[i]=income;
        household_n[i]=id;
        sum +=income;
        }
        
    }
    
    public void calculateAverage()
    {
        average=sum/members;
    }
    
    public void aboveAverage()
    {
        for(int i=0;i<members;i++)
        {
            if(household_t[i]>average)
                    {
                         Formatter n = new Formatter();
                         n.format("ID: %s",household_n[i]);
                         System.out.println(n.toString());
                         
                         Formatter inc = new Formatter();
                         inc.format("Income is: %s",household_t[i]);
                         System.out.println(inc.toString());
                    }
        }
    }
    
    public void povertyCalc()
    {
        poverty=(7500.00 + 950.00 * (members-2));

        for(int i=0;i<members;i++)
        {
            if(household_t[i]<poverty)
            {
                count=count+1;
            }
        }
        
        percentage=(count/members) * 100;
        
        Formatter pov= new Formatter();
        pov.format("Percentage of households below poverty: %s",percentage);
        System.out.println(pov.toString());
    }
    
    public static void main(String[] args)
    {
        Household ob= new Household();
        ob.Input();
        ob.calculateAverage();
        ob.aboveAverage();
        ob.povertyCalc();
    }
}
