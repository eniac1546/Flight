import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
     public static void main(String[] args) {
        
        Cake[] cakes=new Cake[5];
        
        Scanner sc = new Scanner(System.in);

        for(int i =0;i<cakes.length;i++)
        {
            int cakeId = sc.nextInt();sc.nextLine();
            String cakeName = sc.nextLine();
            int pound = sc.nextInt();
            double priceperpound = sc.nextDouble();
            boolean b=sc.nextBoolean();
            cakes[i] = new Cake(cakeId,cakeName,pound,priceperpound,b);
            
        }

        
        
        
        System.out.println(generateBill(cakes));
        //System.out.printf("%.1g\n", generateBill(cakes));
        
        Cake[] newArray=getEgglessCake(cakes);
        for(Cake ck:newArray)
            if(ck!=null)
            {
            System.out.println(ck.getCakeId()+" "+ck.getCakeName());
            }
     }
    
    //implement business methods here
    public static double generateBill(Cake[] c)
    {
        double price1=0;
        double price=0;
        double sum=0;
        double bil=0.0;
        for(Cake ck:c)
        {
             price1=ck.getPound()*ck.getPricePerPound();
            if(ck.isEggless())
            {
                price+=price1+50;

            }
            else
            {
                
                bil+=ck.getPound()*ck.getPricePerPound();
            }
        } 
        sum=bil+price;
        sum=sum+(sum*0.02);

        //DecimalFormat df = new DecimalFormat(".#");
        //return df.format(sum);
     /*   sum=sum*10;
        sum = Math.round(sum);
        sum/=10;*/
        return sum;
    }

    public static Cake[] getEgglessCake(Cake[] c)
    {
        //return c;
        ArrayList<Cake> ck=new ArrayList<>();
        for(Cake i:c)
        {
            if(i.isEggless()==true)
            {
                ck.add(i);
            }
        }//return res2.toArray(new Flight[res2.size()]);
        return ck.toArray(new Cake[ck.size()] );
        
    }

}

class Cake
{
    //implement class 
    int cakeId;
    String cakeName;
    int pound;
    double pricePerPound;
    boolean eggless;
    public Cake(int cakeId, String cakeName, int pound, double pricePerPound, boolean eggless) {
        super();
        this.cakeId = cakeId;
        this.cakeName = cakeName;
        this.pound = pound;
        this.pricePerPound = pricePerPound;
        this.eggless = eggless;
        
        
    }
    public int getCakeId() {
        return cakeId;
    }
    public void setCakeId(int cakeId) {
        this.cakeId = cakeId;
    }
    public String getCakeName() {
        return cakeName;
    }
    public void setCakeName(String cakeName) {
        this.cakeName = cakeName;
    }
    public int getPound() {
        return pound;
    }
    public void setPound(int pound) {
        this.pound = pound;
    }
    public double getPricePerPound() {
        return pricePerPound;
    }
    public void setPricePerPound(double pricePerPound) {
        this.pricePerPound = pricePerPound;
    }
    public boolean isEggless() {
        return eggless;
    }
    public void setEggless(boolean eggless) {
        this.eggless = eggless;
    }
    
