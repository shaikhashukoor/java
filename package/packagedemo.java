import java.util.Scanner;
import mathutils.calculater;

public class packagedemo{
public static void main(String[] args){
Scanner sc = new Scanner (System.in);
calculater calc=new calculater();
System.out.println("enter the first number: ");
double n1=sc.nextDouble();
System.out.println("enter the second number: ");
double n2=sc.nextDouble();


System.out.println("result: ");
System.out.println("addition:" +calc.add(n1,n2 ));
System.out.println("subtraction:  "+calc.sub(n1,n2));
System.out.println("multiplication:  "+calc.mul(n1,n2));

if(n2==0){
System.out.println("division : can't divide by 0");
}
else{
System.out.println("division:  "+calc.div(n1,n2));
}
}
}
