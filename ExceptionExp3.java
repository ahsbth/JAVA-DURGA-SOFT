public class ExceptionExp3 {
public static void main(String args[])
{
    int balance=5000;
    int withdamt=7000;
    if(balance<withdamt) throw new ArithmeticException("insuficient Balance");
    balance=balance-withdamt;
    System.out.println("Transaction Sucessfull");
}
}
