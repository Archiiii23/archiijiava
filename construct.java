 class construct {
    int a;
    String name;
    construct(int a, String name) {
        this.a = a;
        this.name=name;
        System.out.println("name " + ""+name);
        System.out.println("a"+""+a);
    }
}
class v{
    public static void main(String[] args) {
     construct s1=new construct(10,"jain");
     construct s2=new construct(11,"kohli");
     construct s3=new construct(12,"patel");
    }
}