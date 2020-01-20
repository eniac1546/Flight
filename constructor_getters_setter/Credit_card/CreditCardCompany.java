import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CreditCardCompany {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
         Scanner sc = new Scanner(System.in);
          int flag = sc.nextInt();
        if(flag==1){//Average Test case
           Customer c1 = new Customer(123, 10124, 200);
        Customer c2 = new Customer(333, 10125, 200.35);
        
        CreditCardCompany ccCompany = new CreditCardCompany();
        
        double payback = ccCompany.getPaybackAmount(c1);        
        System.out.println("Customer Id:"+c1.getCustId()+"\tAccount Id:"+c1.getAccountId()+"\tCredit Card Charges:"+c1.getCreditCardCharges()+"\tPayback amount:"+payback);
        
        payback = ccCompany.getPaybackAmount(c2);
        System.out.println("\nCustomer Id:"+c2.getCustId()+"\tAccount Id:"+c2.getAccountId()+"\tCredit Card Charges:"+c2.getCreditCardCharges()+"\tPayback amount:"+payback);
        }else{//High Test Case
            
        Customer c1 = new Customer(123, 10124, 200);
        Customer c2 = new Customer(333, 10125, 200.35);
        
        CreditCardCompany ccCompany = new CreditCardCompany();
        
        double payback = ccCompany.getPaybackAmount(c1);        
        System.out.println("Customer Id:"+c1.getCustId()+"\tAccount Id:"+c1.getAccountId()+"\tCredit Card Charges:"+c1.getCreditCardCharges()+"\tPayback amount:"+payback);
        
        payback = ccCompany.getPaybackAmount(c2);
        System.out.println("\nCustomer Id:"+c2.getCustId()+"\tAccount Id:"+c2.getAccountId()+"\tCredit Card Charges:"+c2.getCreditCardCharges()+"\tPayback amount:"+payback);
        }
    }
    
    //Implement method here

    public static double getPaybackAmount(Customer c)
    {
        double sum=0;
        if(c.getCreditCardCharges()<=500)
        {
            sum+=(c.getCreditCardCharges()*0.25)/100;
            //return sum;
            //break;
        }
         if(c.getCreditCardCharges()>500 && c.getCreditCardCharges() <=1500)
        {
            sum+=(c.getCreditCardCharges()*0.50)/100;
            //return sum;
            //break;
        }
        if(c.getCreditCardCharges()>1500 && c.getCreditCardCharges() <=2500)
        {
            sum+=(c.getCreditCardCharges()*0.75)/100;
            //return sum;
            //break;
        }
        if(c.getCreditCardCharges()>2500)
        {
            sum+=(c.getCreditCardCharges()*0.75)/100;
        }
        return sum;
    }
}


class Customer {
    //Implement constructor/getters/setters
int custId;
int accountId;
double creditCardCharges;
public Customer(int custId, int accountId, double creditCardCharges) {
    super();
    this.custId = custId;
    this.accountId = accountId;
    this.creditCardCharges = creditCardCharges;
    
}
public int getCustId() {
    return custId;
}
public void setCustId(int custId) {
    this.custId = custId;
}
public int getAccountId() {
    return accountId;
}
public void setAccountId(int accountId) {
    this.accountId = accountId;
}
public double getCreditCardCharges() {
    return creditCardCharges;
}
public void setCreditCardCharges(double creditCardCharges) {
    this.creditCardCharges = creditCardCharges;
}

}
