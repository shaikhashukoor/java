import java.util.Scanner;


class complex{
double real;
double img;

complex(){
real=0;
img=0;
}

complex(double r,double i){
real=r;
img=i;
}
complex add(complex c2){
complex result=new complex();
result.real=real+c2.real;
result.img=img+c2.img;
return result;
}
complex sub(complex c2){
complex result=new complex();
result.real=real-c2.real;
result.img=img-c2.img;
return result;
}
complex mul(complex c2){
complex result=new complex();
result.real=(real*c2.real)-(img * c2.img);
result.img=(real*c2.img)-(img * c2.real);
return result;
}
void display(){
System.out.println(real+ "+" +img +"i");
}
}
public class complexmain{
public static void main(String[] args){
Scanner num = new Scanner(System.in);
System.out.println("enter the real and imaginary part of number1:");
double r1=num.nextDouble();
double i1=num.nextDouble();
complex c1=new complex (r1,i1);
System.out.println("enter the real and imaginary part of number2:");
double r2=num.nextDouble();
double i2=num.nextDouble();
complex c2=new complex (r2,i2);

System.out.println("---------------result----------------");

complex sum=c1.add(c2);
complex diff=c1.sub(c2);
complex prod=c1.mul(c2);

 System.out.print("sum : ");
 sum.display();
  System.out.print("difference: ");
 diff.display();
  System.out.print("product: ");
 prod.display();
 

}
}


