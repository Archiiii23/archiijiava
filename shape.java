class shape {
    void draw(){
        System.out.println("draw");
    }
}
class circle extends shape {
    void calculateare(){
        System.out.println("Area Calculated");
    }
}
class c{
    public static void main(String[]args){
        circle c1=new circle();
        c1.draw();
        c1.calculateare();
    }
}