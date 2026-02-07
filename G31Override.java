public class G31Override {
    public static void main(String[] args) {
        Child c = new Child(); // Creating an object of Child class
        c.details(); // Calling the overridden method
    }
}
class Parent{
    void details(){
        System.out.println("We r on mission");
    }
}
class Child extends Parent{
    //@Override
    void details(){
        System.out.println("Mission completed");
    }
}
