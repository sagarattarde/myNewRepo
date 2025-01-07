public class interface_implements2 extends interface_implementaion{
    @Override
    public void m1() {
        super.m1();
    System.out.println("My method is m1");
    }

    @Override
    public void m3() {
        super.m3();
        System.out.println("My metod m2");

    }

    @Override
    public void m2() {
        super.m2();
  System.out.println("My method name is m3");
    }

    public static void main(String []args){
        interface_implements2 n=new interface_implements2();
        n.m1();n.m2();n.m3();
    }
}
