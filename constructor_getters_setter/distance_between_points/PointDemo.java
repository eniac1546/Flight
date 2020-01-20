import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PointDemo {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
         Scanner sc = new Scanner(System.in);
          int flag = sc.nextInt();
        //Average Testcase
        if(flag==1){
            Point p1 = new Point(3,2);
            Point p2 = new Point(6,6);
        
             double d = PointDemo.findDistance(p1, p2);
              System.out.println(d);
        }else{//High Testcase
            Point p1 = new Point(3,2);
            Point p2 = new Point(6,6);
        
            double d = PointDemo.findDistance(p1, p2);
           System.out.println(d);
        
           d = PointDemo.findDistance(null,null);
        
           if(d == 0) System.out.println("ok");
        
           d = PointDemo.findDistance(p1,null);
        
           if(d == 0) System.out.println("ok");
        
            d = PointDemo.findDistance(null,p2);
        
            if(d == 0) System.out.println("ok");
        
        }
    }
// implement the static method here

    public static double findDistance(Point p1, Point p2)
    {
       double distance;
        if(p1==null || p2==null)
        {
            distance= 0;
        }
        else
        {
             distance=Math.sqrt(Math.pow(p1.xCoordinate-p2.xCoordinate,2)+Math.pow(p1.yCoordinate-p2.yCoordinate, 2));
        }
        return distance;
    }

}
class Point
{
    double xCoordinate;
    double yCoordinate;
    public Point(double xCoordinate, double yCoordinate) {
        super();
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }
    public double getxCoordinate() {
        return xCoordinate;
    }
    public void setxCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }
    public double getyCoordinate() {
        return yCoordinate;
    }
    public void setyCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
}
