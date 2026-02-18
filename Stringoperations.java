import java.util.Scanner;

public class Stringoperations{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter a string: ");
     String s1 = new String(sc.nextLine());
     System.out.print("");
     
     System.out.println("Length os the string is: "+s1.length());
     System.out.println(" ");
     
     System.out.println("Enter a string for concatinate: ");
     String s2 = new String(sc.nextLine());
     String s3 = s1+" "+s2;
     System.out.println("Concatinated string is: "+s3);
     System.out.println(" ");
     
     System.out.println("character at index 3");
     System.out.println("the character at enterd index is :   "+ s1.charAt(3));
     
     System.out.println("Enter a new string: ");
     String s4 = sc.nextLine();
     System.out.println("Using equals(): "+s1.equals(s4));
     System.out.println("Using CompareTo(): "+s1.compareTo(s4));
     System.out.println(" ");
     
     System.out.println("enter the index you want to check ");
     int index= sc.nextInt();
     System.out.println("the character at enterd index is :   "+ s1.charAt(index));
     
     String s6 = new String("Hello");
     String re = s6.replace("Hello", "hi");
     System.out.println(" ");
     
     System.out.println("Have to replace:"+s6);
     System.out.println("Replaced code is: "+re);
     System.out.println(" ");
     
    System.out.println("change to upper case : "+ s1.toUpperCase());
     
     System.out.println("Enter a number: ");
     int num = sc.nextInt();
     sc.nextLine();
     String numStr = String.valueOf(num);
     System.out.println("String value of number: " + numStr);
     System.out.println(" ");

      System.out.println("Enter a string to split (use comma): ");
      String str = sc.nextLine();
      String[] languages = str.split(",");
      System.out.println("Split string: ");
      for(String lang : languages){
          System.out.println(lang);
      }    
      System.out.println(" ");
  
      System.out.println("Enter a string for StringBuffer: ");
      String sbInput = sc.nextLine();
      StringBuffer sb = new StringBuffer(sbInput);

      System.out.println("Enter a string to append: ");
      String appendStr = sc.nextLine();
      sb.append(" ").append(appendStr);

      System.out.println("StringBuffer result: " + sb);

  }
}
