import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Product[] products = new Product[5];
    
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i<5; i++)
        {
            int productId = sc.nextInt(); sc.nextLine();
            String productName = sc.nextLine();
            int qty = sc.nextInt(); 
            int price = sc.nextInt(); 

            products[i] = new Product(productId, productName, qty, price);
        }    
        
        
        int totalCartPrice = calculateTotalCartPrice(products);
        System.out.println("Total Cart Price : " + totalCartPrice);

        System.out.println("\n");
        
        Product[] productsWithDescendingPrice = arrangeProductsByPriceDescending(products);
        System.out.println("---- PRODUCTS WITH DESCENDING PRICE ----");
        for (Product p : productsWithDescendingPrice) {
            System.out.println(p.getProductName() + " \t\t: " + p.getPrice());
        }
    }
    
    //implement business methods here

    public static int calculateTotalCartPrice(Product[] products)
    {
        int price=0;
        for(int i=0;i<products.length;i++)
        {

        
        price+=products[i].getQty()*products[i].getPrice();

        }
        return price;
    }

    public static Product[] arrangeProductsByPriceDescending(Product[] products)
    {
        for(int i = 0; i < products.length - 1; i++){
            for(int j = i + 1; j < products.length; j++){
                if(products[i].getPrice() < products[j].getPrice()){
                    Product temp = products[i];
                    products[i] = products[j];
                    products[j] = temp;
                }
            }
        }
        return products;
    }

}

class Product
{
    private int productId;
    private String productName;
    private int qty;
    private int price;
    public Product(int productId, String productName, int qty, int price) {
        super();
        this.productId = productId;
        this.productName = productName;
        this.qty = qty;
        this.price = price;
        
        
    }
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
