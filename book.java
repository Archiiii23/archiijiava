 class book {
    void book() {
        System.out.println("Booked");
    }
}
class novel extends book {
    void storyline() {
        System.out.println("Novel");
    }
}
class j{
    public static void main(String[] args) {
        novel n=new novel();
        n.book();
        n.storyline();

    }
}