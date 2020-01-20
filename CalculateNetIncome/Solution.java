import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
         Scanner sc = new Scanner(System.in);
          int flag = sc.nextInt();
        //Average Test Case
        if(flag==1){
            System.out.println(TaxDemo.calculateNetIncome(20000, 5.5));
            System.out.println(TaxDemo.calculateNetIncome(120000, 10.5));
        }else{
            
        double x1 = TaxDemo.calculateNetIncome(150000, -1);
        double x2 = TaxDemo.calculateNetIncome(150000, 0);
        double x3 = TaxDemo.calculateNetIncome(-150000, 50);
        double x4 = TaxDemo.calculateNetIncome(150000, 105);

        if(x1==0.0 || x1==-1.0)
            System.out.println("OK");
        if(x2==0.0 || x2==-1.0)
            System.out.println("OK");
        if(x3==-75000.0)
            System.out.println("OK");
        if(x4==0.0 || x4==-1.0)
            System.out.println("OK");

        }
    }
}

class TaxDemo
{
   public static double calculateNetIncome(double totalSalary, double taxpersentage)
   {
     // private int net_income; 
     double calculateNetIncome;
     if(taxpersentage>0 && taxpersentage<100)
     {
 calculateNetIncome=totalSalary-(totalSalary*taxpersentage)/100;
     }
     else
     calculateNetIncome = 0;
     

     
     return calculateNetIncome;
   } 
}
