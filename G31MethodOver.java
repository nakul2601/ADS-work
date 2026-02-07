public class G31MethodOver {
    public static void main(String[] args) {
        Student s = new Student();
        s.details();
        s.details(5);
        s.details(5, 1.5f);
    }
}

class Student{

    void details(){
        System.out.println("This is G31");
    }
    void details(int a){
        System.out.println("We r learning dsa");
    }
    void details(int a, float b){
        System.out.println("We r iplementing dsa");
    }
    
}
