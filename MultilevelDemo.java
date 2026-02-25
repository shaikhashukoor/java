import java.util.Scanner;
class Person{
String name;
String gender;
String address;
int age;
public Person (String name,String gender,String address,int age){
this.name=name;
this.gender=gender;
this.address=address;
this.age=age;
}
public void display(){
System.out.println("NAME: "+ name);
System.out.println("GENDER: "+ gender);
System.out.println("ADDRESS: "+ address);
System.out.println("AGE: "+ age);
}
}
class Employee extends  Person {
int empid;
String companyname;
String qualification;
double salary;

public Employee ( String name,String gender,String address,int age,int empid,String companyname,String qualification,double salary){
super(name,gender,address,age);
this.empid=empid;
this.companyname=companyname;
this.qualification=qualification;
this.salary=salary;
}
@Override
public void display(){
super.display();
System.out.println("EMPLOYEE ID: "+ empid);
System.out.println("COMPANY NAME: "+ companyname);
System.out.println("QUALIFICATION: "+ qualification);
System.out.println("SALARY: "+ salary);
}
}
class Teacher extends Employee{
String subject;
String department;
int teacherid;

public Teacher(String name, String gender, String address, int age, int empid, String companyname, String qualification,
double salary, String subject, String department, int teacherid) {
super(name,gender,address,age,empid,companyname,qualification,salary);
this.subject=subject;
this.department=department;
this.teacherid=teacherid;
}
@Override
public void display(){
super.display();
System.out.println("SUBJECT : "+ empid);
System.out.println("DEPARTMENT : "+ department);
System.out.println("TEACHER  id : "+ teacherid);
System.out.println("-------------------------------------------------------------");
}
}

public class MultilevelDemo {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of teachers (N): ");
int n = sc.nextInt();
Teacher [] tc= new Teacher [n];
for (int i = 0; i < n; i++) {
System.out.println("\n--- Enter Details for Teacher " + (i + 1)+ " ---");
sc.nextLine(); 
System.out.print("Name: ");
String name = sc.nextLine();
System.out.print("Gender: ");
String gender = sc.nextLine();
System.out.print("Address: ");
String address = sc.nextLine();
System.out.print("Age: ");
int age = sc.nextInt();
System.out.print("emp id : ");
int empid = sc.nextInt();
sc.nextLine();
System.out.print("Company Name: ");
String companyname = sc.nextLine();
System.out.print("Qualification: ");
String qualification = sc.nextLine();
System.out.print("Salary: ");
double salary = sc.nextDouble();
sc.nextLine();
System.out.print("Teacher ID: ");
int teacherid = sc.nextInt();
sc.nextLine();

System.out.print("Subject: ");
String subject = sc.nextLine();
System.out.print("Department: ");
String department = sc.nextLine();

tc [i]= new Teacher( name,gender,address,age,empid,companyname,qualification,salary,subject,department,teacherid);
}

System.out.println("\n========================================");
System.out.println(" TEACHER RECORDS");
System.out.println("========================================");


for (int i = 0; i < n; i++) {
tc[i].display();
}
sc.close();
}
}


