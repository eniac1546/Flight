import java.text.DecimalFormat;
import java.util.*;

public class Solution {
    
    
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("0.00");
        
        Tourist[] tourists = new Tourist[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<tourists.length; i++){
            
            int touristId = sc.nextInt();sc.nextLine();
            String touristName = sc.nextLine();
            int milesTravelled = sc.nextInt();
            int noOfFlights = sc.nextInt();

            tourists[i]= new Tourist(touristId,touristName,milesTravelled,noOfFlights);
            
        }
        sc.nextLine();
        String membershipTier=sc.nextLine();
        
        tourists=updateTouristMembershipDetails(tourists);
        
        for(Tourist tourist: tourists){
            
            System.out.println(df.format(tourist.getMilesIndex()));
        }
        
    
        Tourist[] tierTourists= retrieveTouristsByMembershipTier(tourists, membershipTier);
        
        for (Tourist tourist: tierTourists){
            
            System.out.println(tourist.getTouristId());
            System.out.println(tourist.getMembershipTier());
        }
        
        sc.close();
    }
    public static Tourist[] updateTouristMembershipDetails(Tourist tourists[])
    {

        for(int i=0;i<tourists.length;i++)
        {
            double miles=(tourists[i].getMilesTravelled()*0.0001)+(tourists[i].getNoOfFlights()*0.01);
            tourists[i].setMilesIndex(miles);
        }
         for(int i=0;i<tourists.length;i++)
         {
             if(tourists[i].getMilesIndex()<0.5)
             {
                 tourists[i].setMembershipTier("Silver");
             }
             else if(tourists[i].getMilesIndex()<1 && tourists[i].getMilesIndex()>0.5)
             {
                 tourists[i].setMembershipTier("Gold");
             }
             else if(tourists[i].getMilesIndex()>1 )
             {
                 tourists[i].setMembershipTier("Platinum");
             }
         }
         return tourists;
    }
    public static Tourist[] retrieveTouristsByMembershipTier(Tourist tourists[],String membershipTier)
    {
        int c = 0;
        for (int i = 0; i < tourists.length; i++) {
            if (tourists[i].getMembershipTier().equals(membershipTier)) {
                c++;
            }
        }
        Tourist[] f1 = new Tourist[c];
        c = 0;
        for (int i = 0; i < tourists.length; i++) {
            
            if (tourists[i].getMembershipTier().equals(membershipTier)) {
                f1[c] = tourists[i];
                c++;
            }
        }

        return f1;

    }


}

class Tourist 
{
    int touristId;
    String touristName;
    int milesTravelled;
    int noOfFlights;
    double milesIndex;
    String membershipTier;
    public Tourist(int touristId, String touristName, int milesTravelled, int noOfFlights) {
        super();
        this.touristId = touristId;
        this.touristName = touristName;
        this.milesTravelled = milesTravelled;
        this.noOfFlights = noOfFlights;
        
    }
    public int getTouristId() {
        return touristId;
    }
    public void setTouristId(int touristId) {
        this.touristId = touristId;
    }
    public String getTouristName() {
        return touristName;
    }
    public void setTouristName(String touristName) {
        this.touristName = touristName;
    }
    public int getMilesTravelled() {
        return milesTravelled;
    }
    public void setMilesTravelled(int milesTravelled) {
        this.milesTravelled = milesTravelled;
    }
    public int getNoOfFlights() {
        return noOfFlights;
    }
    public void setNoOfFlights(int noOfFlights) {
        this.noOfFlights = noOfFlights;
    }
    public double getMilesIndex() {
        return milesIndex;
    }
    public void setMilesIndex(double milesIndex) {
        this.milesIndex = milesIndex;
    }
    public String getMembershipTier() {
        return membershipTier;
    }
    public void setMembershipTier(String membershipTier) {
        this.membershipTier = membershipTier;
    }
}
