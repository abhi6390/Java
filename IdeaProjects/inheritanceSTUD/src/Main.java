class Rectangle{
    double length;
    double breadth;

    Rectangle(){
        length=1;
        breadth=1;
    }
    Rectangle(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    double area()
    {
        return (length*breadth);
    }

}
class cuboid extends Rectangle{
    double height;
    cuboid(){
        height=1;
    }
    cuboid(double length, double breadth, double height){
        super(length, breadth);
        this.height=height;
    }
    double volume(){
       return (length*breadth*height);
    }
}


public class Main {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(10,20);
        cuboid c1=new cuboid(10,20,30);
        System.out.println("Area of rect: "+r1.area());
        System.out.println("Volume of cuboid: "+c1.volume());
    }
}