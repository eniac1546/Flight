package assignment;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
    
        
        Flight[] flts = new Flight[2];
        
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0;i<2;i++)
        {
            String FlightId = sc.nextLine();
            String Departure_From = sc.nextLine();
            String Arrival_To = sc.nextLine();
            double duration = sc.nextDouble();sc.nextLine();
            boolean Meal_available = sc.nextBoolean();sc.nextLine();

            flts[i] = new Flight(FlightId,Departure_From,Arrival_To,duration,Meal_available);
           // System.out.println("input received");
        }
        String dep_from = sc.nextLine();
        String arv_to = sc.nextLine();
        
        Flight[] FlightArray = SearchFlight(flts);
        
        System.out.println("Flight_ID Duration Meal_Available");
        for(Flight f : FlightArray)
        {
        System.out.println(f.FlightId+"       "+f.duration+"       "+f.Meal_available);
        }
        
        System.out.println("--------------------------------------------------------");
        
        System.out.println("Flight_ID Dep  Arv   Duration");
        
            
     Flight[] FltDetl = GetFlightDetails(flts,dep_from,arv_to);

        
        for(Flight f : FltDetl)
        {
        System.out.println(f.FlightId+"      "+f.getDeparture_From()+"  "+f.getArrival_To()+"    "+ f.getDuration());
        }
    }
   // 
    public static Flight[] SearchFlight(Flight F[])
    {
        //implement method
    	ArrayList <Flight> res = new ArrayList<>();
    	for(int i=0; i<F.length; i++)
    	{
    		if(F[i].getDuration()>120 && F[i].getMeal_available()==true)
    		{
    			 res.add(F[i]);
    		}
    	}
    	return res.toArray(new Flight[res.size()]);
    	
    }
    //
   public static Flight[] GetFlightDetails(Flight[] f,String dep,String arv)
    {
        //implement method 
	   
	   ArrayList <Flight> res2 = new ArrayList<>();
	   for(int i=0; i<f.length;i++)
	   {
		   if(f[i].getArrival_To().equals(arv) && dep.equals(f[i].getDeparture_From()))
		   {
			   //System.out.println(f[i].getArrival_To().equals(arv) );
			   //res2.add(f[i]);
			 int flag=0;
			 for(int in=0;in<res2.size();in++)
			 {
				 if(res2.get(in).getDuration()>f[i].getDuration())
				 {
					 res2.add(in,f[i]);
					 flag ++;
					 break;
				}
			 }if (flag==0)
			 {
				 res2.add(f[i]);
			 }
			   
		   }
	   }
	   return res2.toArray(new Flight[res2.size()]);
	   //return f;
    }



}
//
class Flight
{
    String FlightId;
    String Departure_From;
    String Arrival_To;
    double duration;
    boolean Meal_available;
    //constructor
    public Flight(String FlightId, String Departure_From,String Arrival_To,double duration,boolean Meal_available){
        this.FlightId = FlightId;
        this.Departure_From = Departure_From;
        this.Arrival_To = Arrival_To;
        this.duration = duration;
        this.Meal_available = Meal_available;
    }
    //access
    public String getFlightId(){
        return this.FlightId;
    }
    public String getDeparture_From(){
        return this.Departure_From;
    }

    public String getArrival_To(){
        return this.Arrival_To;

    }

    public double getDuration()
    {
        return this.duration;
    }
    
    public boolean getMeal_available()
    {
        return this.Meal_available;
    }

    public void setFlightId(String FlightId)
    {
        this.FlightId=FlightId;
    }

    public void setDeparture_From(String departure_From)
    {
        this.Departure_From=departure_From;
    }

    public void setArrival_To(String at)
    {
        this.Arrival_To=at;
    }

    public void setDuration(double Dr)
    {
        this.duration=Dr;
    }

    public void setMeal_available(boolean ma)
    {
        this.Meal_available=ma;
    }
}
