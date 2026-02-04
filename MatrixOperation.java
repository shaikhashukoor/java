import java.util.Scanner;
public class MatrixOperation{
public static void main (String[] args){
Scanner sc=new Scanner(System.in);

System.out.println("----enter dimension for Matrix A---");
System.out.println("rows:");
int r1=sc.nextInt();
System.out.println("column:");
int c1=sc.nextInt();

System.out.println("----enter dimension for Matrix A---");
System.out.println("rows:");
int r2=sc.nextInt();
System.out.println("column:");
int c2=sc.nextInt();

int[][] A= new int[r1][c1];
int[][] B = new int[r2][c2];

System.out.println("enter elemets for matrix A");
for(int i=0; i<r1; i++){
for(int j=0; j<c1; j++){
A[i][j]=sc.nextInt();
}
}

System.out.println("enter elemets for matrix B");
for(int i=0; i<r2; i++){
for(int j=0; j<c2; j++){
B[i][j]=sc.nextInt();
}
}

while(true){
System.out.println("\n---menu---");
System.out.println("1.addiction");
System.out.println("2.multiplication");
System.out.println("3.exit");
System.out.println("enter your choice :");
int choice=sc.nextInt();

if (choice == 3) break;
switch(choice){
case 1:
if(r1 == r2 && c1 == c2){
System.out.println("sum matrix:");
for(int i=0; i<r1; i++){
for(int j=0; j<c1; j++){
System.out.print(A[i][j]+B[i][j]+"\t");
}
System.out.println();
}
}
else
{
System.out.println("error:dimention must be same for additon");
}
break;
case 2:
if(c1==r2){
System.out.println("product matrix");
int[][] C=new int [r1][c2];
for(int i=0; i<r1; i++){
for(int j=0; j<c2; j++){
C[i][j]=0;
for(int k=0; k<c1; k++){
C[i][j]+=A[i][k]*B[k][j];
}
System.out.print(C[i][j]+"\t" );
}
System.out.println();
}
}
else{
System.out.println("rror row of a must be equal row o b");
}
break;
default:
System.out.println("invalid choice");
}
}
}
}




