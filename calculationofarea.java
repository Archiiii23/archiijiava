public class calculationofarea {
        void calculatearea ( int radius){
            int circlearea= 22/7*radius*radius;
            System.out.println("Area of circle is " + circlearea);
        }
        void calculatearea ( int length,int width){
            int rectanglearea = length*width;
            System.out.println("Area of rectangle is " + rectanglearea);
        }
        void calculatearea ( int length,int width, int height){
            int trianglearea = 1/2*width*height;
            System.out.println("Area of triangle is " + trianglearea);
        }
        public static void main(String[] args) {
            calculationofarea a = new calculationofarea();
            a.calculatearea(5);
            a.calculatearea(12,10);
            a.calculatearea(5,15,12);
        }
    }


