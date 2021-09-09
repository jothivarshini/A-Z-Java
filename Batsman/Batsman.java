package Batsman;
import java.util.*;
public class Batsman{
    public String bcode;
    public String bname;
    public int runs;
    public int innings;
    public int notout;
    public int batavg;
    
    Scanner sc = new Scanner(System.in);
    
    public void readData()
    {
        System.out.println("Enter code");
        bcode=sc.next();
        System.out.println("Enter Name");
        bname=sc.next();
        System.out.println("Enter Runs");
        runs=sc.nextInt();
        System.out.println("Enter Innings");
        innings=sc.nextInt();
        System.out.println("Enter notout count");
        notout=sc.nextInt();   
    }
    
    public void calcAvg()
    {
        batavg =runs/(innings-notout);
    }
    
    public void displayData()
    {
        Formatter bc= new Formatter();
        bc.format("bcode %s",bcode);
        System.out.println(bc.toString());
        
        Formatter bn= new Formatter();
        bn.format("bname %s",bname);
        System.out.println(bn.toString());
        
        Formatter i= new Formatter();
        i.format("bcode %s",innings);
        System.out.println(i.toString());
        
        Formatter r= new Formatter();
        r.format("runs %s",runs);
        System.out.println(r.toString());
        
        Formatter n= new Formatter();
        n.format("notout %s",notout);
        System.out.println(n.toString());
        
        Formatter ba= new Formatter();
        ba.format("bataverage %s",batavg);
        System.out.println(ba.toString());
    }
 
    
    public static void main(String[] args)
    {
       Batsman ob= new Batsman();
       ob.readData();
       ob.calcAvg();
       ob.displayData();      
    }
 
}
