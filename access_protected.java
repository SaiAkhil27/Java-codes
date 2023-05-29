
class A {
    protected int a=20;
    protected void msg(){
        System.out.println("hello");
    }
}
class B extends A{
  
}
public class access_protected {
    public static void main(String[] args) {
        B obj = new B();
        obj.msg();
    }
    
    
}
