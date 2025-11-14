 class person {
    void displayName(){
        System.out.println("display name");
     }
}
class student extends person{
    void displayclass(){
        System.out.println("display class");
    }
}
class monitor extends student {
    void checkdiscipline(){
        System.out.println("IN DISCIPLINE");
    }
}
class b{
    public static void main(String[] args) {
        monitor m=new monitor();
        m.displayName();
        m.displayclass();
        m.checkdiscipline();
    }
}