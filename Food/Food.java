package Food;
import java.util.*;
public class Food {
    public int empid;
    public String custname;
    public int starter;
    public int maincourse;
    public int dessert;
    public int nuggets=0,soup=0,rolls=0,pasta=0,pizza=0,rice=0,brownie=0,pie=0,icecream=0;
    
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter empid");
        empid=sc.nextInt();
        System.out.println("Enter name:  ");
        custname=sc.next();
        System.out.println("\n Enter starter:\n Nuggets,Soup,Rolls");
        starter=sc.nextInt();
        if(starter==1)
            nuggets=nuggets+1;
        else if(starter==2)
            soup=soup+1;
        else if(starter==3)
            rolls=rolls+1;
        System.out.println("\n Enter main course:\n Rice,Pasta,Pizza");
        maincourse=sc.nextInt();
        if(maincourse==1)
            pasta=pasta+1;
        else if(maincourse==2)
            pizza=pizza+1;
        else if(maincourse==3)
            rice=rice+1;
        System.out.println("\n Enter dessert:\n Brownie,Pie,Icecream");
        dessert=sc.nextInt();  
        if(dessert==1)
            brownie=brownie+1;
        else if(dessert==2)
            pie=pie+1;
        else if(dessert==3)
            icecream=icecream=1;
    }
    
   public static void main(String[] args) 
    {
       Food ob[] = new Food[5];
       for(int i=0;i<5;i++)
       {
           ob[i]=new Food();
           ob[i].input();
       } 
       int nuggets=0,soup=0,rolls=0,pasta=0,pizza=0,rice=0,brownie=0,pie=0,icecream=0;
       for(int i=0;i<5;i++)
       {
           nuggets=nuggets+ob[i].nuggets;
           soup=soup+ob[i].soup;
           rolls=rolls+ob[i].rolls;
           pasta=pasta+ob[i].pasta;
           pizza=pizza+ob[i].pizza;
           rice=rice+ob[i].rice;
           brownie=brownie+ob[i].brownie;
           pie=pie+ob[i].pie;
           icecream=icecream+ob[i].icecream;
       }
       
       System.out.println("The finalized Starter is: ");
       if(nuggets>soup & nuggets>rolls)
           System.out.println("Nuggets");
       else if(soup>nuggets & soup>rolls)
           System.out.println("Soup");
       else
           System.out.println("Rolls");
       
       System.out.println("The finalized Maincourse is: ");
       if(pasta>pizza & pasta>rice)
           System.out.println("Pasta");
       else if(pizza>pasta & pizza>rice)
           System.out.println("Pizza");
       else
           System.out.println("Rice");
       
       System.out.println("The finalized Dessert is: ");
       if(brownie>pie & brownie>icecream)
           System.out.println("Brownie");
       else if(pie>brownie & pie>icecream)
           System.out.println("Pie");
       else
           System.out.println("Icecream");
       
       
    }
   
    
}
