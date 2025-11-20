interface walkable{
    void walk();
}
interface runable{
    void run();
}
class human implements walkable,runable{
    public void walk(){
        System.out.println("walk");
    }
    public void run(){
        System.out.println("run");
    }
        public static void main(String[] args) {
        human w=new human();
        w.walk();
        w.run();
    }
}

