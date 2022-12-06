class rectangle{
    public  double length, breadth; //private automatic
       //private double length, breadth;
    public double area(){
        return (length*breadth);
    }
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    /*double getLength(){
        return length;
    }
    void setLength(int l){
        length=l;
    }*/
   /* double getBreadth(){
        return length;
    }
    void setBreadth(int b){
        breadth=b;
    }*/
}
class cylinder extends rectangle{
    public double height;
    public double volume(){
        return area()*height;
    }
}
public class Main {

    public static void main(String[] args) {
        rectangle r1=new rectangle();
        cylinder c1=new cylinder();
        r1.length=20;
        r1.breadth=20;
        c1.height=20;
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        System.out.println(c1.volume());
    }
}