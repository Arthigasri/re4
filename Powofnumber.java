# re4
import java.io.*;
import java.util.*;
public class Powofnumber
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a,b;
    double temp;
    System.out.println("Enter the number");
    a=sc.nextInt();
    System.out.println("Enter the power of number");
    b=sc.nextInt();
    temp=Math.pow(a,b);
    System.out.println(temp);
  }
}
