public class Demo {
    Demo(){
        super();
        System.out.println("alertString123");

    }void mai(){
        System.out.println("12222");

    }
    void mai(int a){
        System.out.println("test123");
    }
    void mai(int b,float c){
        System.out.println("alertString");
    }
    public  static void main(String[]args){
        System.out.println();
        Demo d =new Demo();
        d.mai(100, 200.5F);


    }
}
