public class staticclass {
    static String name="AJ";
    void Sum(){
        System.out.println(name);

    }
}
class Main{
    public static void main(String[] args){
        staticclass obj = new staticclass();
        obj.Sum();
    }
}