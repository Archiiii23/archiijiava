public class studentdetails {
    String name;
    int Rollno;
    double marks;
    void show(){
        System.out.println("Name : "+name);
        System.out.println("Rollno : "+Rollno);
        System.out.println("Marks : "+marks);

    }
    public static void main(String[] args) {
        studentdetails s1= new studentdetails();
        studentdetails s2= new studentdetails();
        studentdetails s3= new studentdetails();

        s1.name="MUSKAN";
        s1.Rollno=196;
        s1.marks=8.57;

        s2.name="ARCHI";
        s2.Rollno=173;
        s2.marks=8.86;

        s3.name="PRANYA";
        s3.Rollno=241;
        s3.marks=8.33;

        s1.show();
        s2.show();
        s3.show();
    }
}

