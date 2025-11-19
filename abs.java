
    abstract class janwar{
        abstract void eat();
    }
    class rabbit extends janwar{
        void eat(){
            System.out.println("carrot");
        }
    }
    class o{
        public static void main(String[] args) {
            rabbit s=new rabbit();
            s.eat();

        }
    }

