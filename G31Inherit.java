public class G31Inherit {
    public static void main(String[] args) {
       Child c = new Child();
        c.details();
        c.dsa();
        c.imp();
    }
}
class Parent{
    void details(){
        System.out.println("This is DSA class");
    }
    void dsa(){
        System.out.println("We r learning DSA");
    }
}
class Child extends Parent{
    void imp(){
        System.out.println("we r implementing dsa using java");
    }
}
