public class overwriting {
    void eat(){
        System.out.println("Spring roll");
    }
}
class dog extends overwriting{
    void bark(){
        System.out.println("bhow bhoww");
    }
}
class q{
    public static void main(String[] args) {
        overwriting o = new overwriting();
        o.eat();
        
    }
}