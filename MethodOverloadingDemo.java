import java.util.Scanner;
class Geometry{
double area (double r){
return Math.PI*r*r;
}
double area(double le,double  be){
return le*be;
}
double area(double l, double b,double h){
if ((l+b<=h) || (l+h<=b) || (b+h<=l)){
System.out.println("triangle inequality: ");
}
double s=(l+b+h)/2;
return Math.sqrt(s*(s-l)*(s-b)*(s-h));
}
}

public class MethodOverloadingDemo{
public static void main(String [] args){
Scanner sc= new Scanner (System.in);
Geometry demo= new Geometry();
System.out.println("enter radiius of the circle: ");
double r=sc.nextDouble();
double c=demo.area (r);
System.out.println("area of circle :"+c); 
System.out.println("enter length and breadth rectangle: ");
double le=sc.nextDouble();
double be=sc.nextDouble();
double re=demo.area (le,be);
System.out.println("area of rectangle :"+re);
System.out.println("enter length,breadth and height of the triangle: ");
double l=sc.nextDouble();
double b=sc.nextDouble();
double h=sc.nextDouble();
double t=demo.area (l,b,h);
System.out.println("area of triangle: "+t);
}
}


