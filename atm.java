public class atm {
    private int totalbalance=50000;
    public void getB() {
System.out.println("TOTAL BALANCE: "+totalbalance);
    }
    public void setbalance(int amount) {
        if (amount>0) {
            totalbalance = amount;
        }
    }
}
class p{
    public static void main(String[] args) {
        atm a=new atm();
        a.getB();
        a.setbalance(5000);
    }
}