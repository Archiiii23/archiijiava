interface A{
    void display();
}
interface H{
    void display();
}
class demo implements A,H{
    public void display(){
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        demo d = new demo();
        d.display();
    }
}


