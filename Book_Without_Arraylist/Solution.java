import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
 
public class Solution {
    public static void main(String args[] ) throws Exception {
    Book[] books = new Book[4];
        double min = 0;
        double max = 0;
        
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0;i<books.length;i++)
        {
            int id = sc.nextInt();
            String title = sc.nextLine();
            String author = sc.nextLine();
            sc.nextLine();
            double price = sc.nextDouble();
            
            books[i]= new Book(id,title,author,price);
        }
        min = sc.nextDouble();
        max = sc.nextDouble();
        
        Book[] newBooks = booksWithPriceRange(min,max,books);
        
    for(Book b:newBooks)
             System.out.println(b.getId());
    }
    
    //implement business methods here
    public static Book[] booksWithPriceRange(double min,double max,Book[] books)    {
        int c=0,k=0;
        for(int i=0;i<books.length;i++)
        {
            if(books[i].getPrice()>min && books[i].getPrice()<max)
            {
                c++;
            }
        }
        Book[] arr=new Book[c];
        for(int i=0;i<books.length;i++)
        {
            if(books[i].getPrice()>min && books[i].getPrice()<max)
            {
                arr[k] =books[i];
                k++;
            }
        }
 
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j].getId()>arr[j+1].getId())
                {
                    Book temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
 
    }
}
 
class Book
{
    //implement class here
    int id;
    String title;
    String author;
    double price;
    public Book(int id, String title, String author, double price) {
        super();
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
}
