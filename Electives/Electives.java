package Electives;
import java.util.*;
public class Electives {
    public String regno;
    public String name;
    public int elective1;
    public int elective2;
    public int hum=0,psy=0,microecon=0,networks=0,os=0,dbms=0;
    
    public void input()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter regno");
        regno=sc.next();
        System.out.println("Enter Name");
        name=sc.next();
        System.out.println("\n Enter Elective-1:\n Humanities,Psychology,Microeconomics");
        elective1=sc.nextInt();
        if(elective1==1)
            hum=hum+1;
        else if(elective1==2)
            psy=psy+1;
        else if(elective1==3)
            microecon=microecon+1;
        System.out.println("\n Enter Elective-2:\n Networks,Operating Systems,DBMS");
        elective2=sc.nextInt();
        if(elective2==1)
            networks=networks+1;
        else if(elective2==2)
            os=os+1;
        else if(elective2==3)
            dbms=dbms+1;
    }
   
    public static void main(String[]args)
    {
        Electives ob[]= new Electives[5];
        for(int i=0;i<4;i++)
        {
            ob[i]=new Electives();
            ob[i].input();
        }
        int hum=0,psy=0,microecon=0,networks=0,os=0,dbms=0;
        for(int i=0;i<4;i++)
       {
           hum=hum+ob[i].hum;
           psy=psy+ob[i].psy;
           microecon=microecon+ob[i].microecon;
           networks=networks+ob[i].networks;
           os=os+ob[i].os;
           dbms=dbms+ob[i].dbms;  
       }
        
       System.out.println("The First Elective is");
       if(hum>psy & hum>microecon)
           System.out.println("Humanities");
       else if(psy>hum & psy>microecon)
           System.out.println("Psychology");
       else if(microecon>hum & microecon>psy)
           System.out.println("Microeconomics");
       else if(hum==psy & hum>microecon)
           System.out.println("Humanities and Psychology");
       else if(hum==microecon & hum>psy)
           System.out.println("Humanities and Microeconomics");
       else
           System.out.println("Pyschology and Microeconomics");
       
       System.out.println("The Second Elective is");
       if(networks>os & networks>dbms)
           System.out.println("Networks");
       else if(os>networks & os>dbms)
           System.out.println("Operating Systems");
       else if(dbms>networks & dbms>os)
           System.out.println("DBMS");
       else if(networks==os & networks>dbms)
           System.out.println("Networks and Operating Systems");
       else if(networks==dbms & networks>os)
           System.out.println("Networks and DBMS");
       else
           System.out.println("Operating Systems and DBMS");
      
    }
      
}
