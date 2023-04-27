class Second {
    public static void main(String args[])
    {   
        A a=new A();
        a.methode1();
        B b=new B();
        b.methode2();
       // C c=new C();
       // c.methode3();
        //D d=new D();
        d.methode4();
        System.out.println("Main class Second");
    }
}
class A{
     void methode1()
     {
        System.out.println("Hello A");
     }
}
public class B{
     void methode2()
     {
        System.out.println("Hello B");
     }
}
class C{
    void methode3()
    {
        System.out.println("Hello C");
    }
}
class D{
    void methode4()
    {
        System.out.println("Hello D");
    }
}
