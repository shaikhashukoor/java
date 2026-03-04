import java.util.Scanner;
class Publisher{
String publishername;
public Publisher(String publishername){
this.publishername=publishername;
}
public void display(){
System.out.println("NAME OF PUBLISHER: "+publishername);
}
}
class Book extends Publisher{
String bookname;
String author;
double price;
public Book(String publishername,String bookname,String author,double price){
super(publishername);
this.bookname=bookname;
this.author=author;
this.price=price;
}
@Override
public void display(){
super.display();
System.out.println("NAME OF book: "+bookname);
System.out.println("NAME OF author: "+author);
System.out.println("price: "+price);
}
}
class Literature extends Book{
String type;
public Literature(String publishername,String bookname,String author,double price,String type){
super(publishername,bookname,author,price);
this.type=type;
}
@Override
public void display(){
super.display();
System.out.println("literature name "+type);
System.out.println("-----------------------------------");
}
}
class Fiction extends Book{
String genre;
public Fiction(String publishername,String bookname,String author,double price,String genre){
super(publishername,bookname,author,price);
this.genre=genre;
}
@Override
public void display(){
super.display();
System.out.println("fiction name "+genre);
System.out.println("-----------------------------------------");
}
}
public class HierarchicalInheritanceDemo{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter total number of books: ");
int n=sc.nextInt();
Book[] bk=new Book[n];
for(int i=0;i<n;i++){
System.out.println("\n--- Enter Details for Book "+(i+1)+" ---");
System.out.print("Select Category (1 for Literature, 2 for Fiction): ");
int choice=sc.nextInt();
sc.nextLine();
System.out.print("Publisher Name: ");
String pubName=sc.nextLine();
System.out.print("Book Name: ");
String bName=sc.nextLine();
System.out.print("Author: ");
String author=sc.nextLine();
System.out.print("Price: ");
double price=sc.nextDouble();
sc.nextLine();
if(choice==1){
System.out.print("Literature Type: ");
String type=sc.nextLine();
bk[i]=new Literature(pubName,bName,author,price,type);
}else if(choice==2){
System.out.print("Fiction Genre: ");
String genre=sc.nextLine();
bk[i]=new Fiction(pubName,bName,author,price,genre);
}else{
System.out.println("Invalid choice.");
}
}
System.out.println("\n--- Display Books by Category ---");
System.out.print("Enter category to display (1 for Literature, 2 for Fiction): ");
int searchChoice=sc.nextInt();
boolean found=false;
for(int i=0;i<n;i++){
if(searchChoice==1&&bk[i] instanceof Literature){
bk[i].display();
found=true;
}
if(searchChoice==2&&bk[i] instanceof Fiction){
bk[i].display();
found=true;
}
}
if(!found){
System.out.println("No books found in the selected category.");
}
sc.close();
}
}
