 class device {
    void poweron() {
        System.out.println("Power on");
    }
}
    class laptop extends device {
        void boot() {
            System.out.println("Booted");
        }
    }
    class gaminglaptop extends laptop{
        void gaminglaptop() {
            System.out.println("Start Game");
        }
    }
    class l{
    public static void main(String[] args){
        gaminglaptop l1=new gaminglaptop();
        l1.poweron();
        l1.gaminglaptop();
        l1.boot();
    }
    }

