import java.util.Scanner;
class product{
// data members
String pname;
int pcode;
double price;
// default constructor
product(){
pcode=0;
pname="unknown";
price=0;
}

product(int c,String n,double p){
pcode=c;
pname=n;
price=p;
}
void display(){
System.out.println(pcode +"\t"+pname+"\t"+price);
}
}
public class productsample{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
product p1=new product(101,"laptop",45000.00);


System.out.println("enter details of product 2 ");



System.out.println("enter product code :");
int c2=sc.nextInt();
sc.nextLine();

System.out.println("enter product name :");
String n2=sc.nextLine();

System.out.println("enter product price :");
double pr2=sc.nextDouble();

product p2=new product(c2,n2,pr2);
System.out.println("enter details of product 3 ");

product p3=new product();

System.out.println("enter product code :");
p3.pcode=sc.nextInt();
sc.nextLine();

System.out.println("enter product name :");
p3.pname=sc.nextLine();

System.out.println("enter product price :");
p3.price=sc.nextDouble();

System.out.println("-----product with lowest price-----");
product low=p1;
if(p2.price<low.price){
low=p2;
}
if(p3.price<low.price){
low=p3;
}

System.out.println("pcode \t pname \t price");
low.display();
}
}























