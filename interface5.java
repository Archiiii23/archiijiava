interface shape1{
    void area1();
}
class circle1 implements shape1{
    public void area1(){
        int area;
        int radius=5;
        area = 22/7*radius*radius;
        System.out.println("Area of circle is "+area);
    }
    public static void main(String[]args){
        circle1 c=new circle1();
        c.area1();
    }
}