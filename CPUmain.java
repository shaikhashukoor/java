import java.util.Scanner;
class CPU{
double price;

CPU(double p ){
price=p;
}

class processor{
double no_of_cores;
String manufacturer;

processor (double c, String m ){
no_of_cores=c;
manufacturer=m;
}
}
static class RAM {
int memory;
String manufacturer; 

RAM (int me ,String mf){
memory=me;
manufacturer=mf;
}
}

}
public class CPUmain{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the price of the cpu");
double p=sc.nextDouble();
sc.nextLine();
CPU pc = new CPU (p);


System.out.println("enter the no of cores of the processor");
double c=sc.nextDouble();
sc.nextLine();
System.out.println("enter the manufactor of the processor");
String m=sc.nextLine();
CPU.processor pro = pc.new processor(c,m);


System.out.println("enter memory size of the ram");
int me=sc.nextInt();
sc.nextLine();
System.out.println("enter manufacturer of the ram");
String mf=sc.nextLine();
CPU.RAM r= new CPU.RAM(me,mf);

System.out.println("---------CPU---------");
System.out.println("price:" + pc.price);
System.out.println("cores of processor:" + pro.no_of_cores);
System.out.println("manufactorer of processor:"+  pro.manufacturer);
System.out.println("memory of ram:"  + r.memory);
System.out.println("manufacturer of ram:"  + r.manufacturer);

}
}
