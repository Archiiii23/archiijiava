 class employee {
    void work(){
        System.out.println("Employee is working...");
    }
}
class manager extends employee {
    void attend(){
        System.out.println("manager is working...");
    }
}
class a {
    public static void main(String[] args) {
        manager m = new manager();
        m.work();
        m.attend();
    }
}
