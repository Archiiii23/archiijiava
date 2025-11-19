class overwrite {
    void eat(){
        System.out.println("MOMO");
    }
    void data(){
        System.out.println("I LOVE EATING");
    }
}
class elephant extends overwrite{
    void eat(){
        System.out.println("I LOVE VIRAT KOHLIIIIIII");
    }
}

class e{
    public static void main(String[] args) {
        overwrite o1 = new overwrite();
        o1.eat();
        o1.data();

        elephant e = new elephant();
        e.eat();
    }
}