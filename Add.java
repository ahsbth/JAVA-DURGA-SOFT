import java.util.Scanner;
public class Add {
    public static void main(String args[])
    {
      int a,b;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of a=");
      a=sc.nextInt();
      System.out.println("Enter the value of b=");
      b=sc.nextInt();
      try{
      System.out.println("Product="+(a*b));
      if(b==0) throw new ArithmeticException("/ by zero");
      System.out.println("Devide="+(a/b));
      System.out.println("Mode="+(a%b));
      System.out.println("Add="+(a+b));
      System.out.println("Substraction="+(a-b));
      }
      catch(ArithmeticException e)
      {
        System.out.println(e.getMessage());
      }
    }

}
