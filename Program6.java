//import stuff here!

//Your code here
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        double pi = 3.14159;
        Scanner radius = new Scanner(System.in);
       System.out.println(" enter radius here ");
       double Radius = radius.nextDouble();
       double area = pi*Radius*Radius;
       int area1 = (int) (1000*area);
       double area2 = (double) area1/1000;
       double diameter = 2*Radius;
       double circumference= 2*pi*Radius;
       double c1 = (int)(1000*circumference);
       double c2 = (double) c1/1000;
       System.out.println("the radius of the circle is "+ Radius);
        System.out.println("the area of the circle is "+ area2);
         System.out.println("the diameter of the circle is "+diameter);
          System.out.println("the circumference of the circle "+ c2);
       
       
       
    
    }
}
//Paste console output below:
/*

java -cp /tmp/QIICasjCu9/HelloWorld
 enter radius here 
3.712
the radius of the circle is 3.712
the area of the circle is 43.287
the diameter of the circle is 7.424
the circumference of the circle 23.323

=== Code Execution Successful ===
*/
