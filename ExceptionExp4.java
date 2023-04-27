public class ExceptionExp4 {
    public static void main(String args[])
    {
        int balance=5000;
        int withdamt=6000;
        try{
            if(balance<withdamt) throw new ArithmeticException("Insufficient Balance");
            balance=balance-withdamt;
            System.out.println("Transaction Successfull");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception is:"+e.getMessage());
        }
        System.out.println("Thanks");
    }
}
