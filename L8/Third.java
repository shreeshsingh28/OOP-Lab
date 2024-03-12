interface Area{
    double ar();
}

class Rectangle implements Area{
    double length, breadth;
    Rectangle(double l, double b){
        length=l;
        breadth=b;
    }
    public double ar(){
        return length*breadth;
    }
}

class Circle implements Area{
    double radius;
    Circle(double r){
        radius=r;
    }
    public double ar(){
        return 3.14*radius*radius;
    }
}

public class Third{
    public static void main(String args[]){
        Rectangle r= new Rectangle(4,3);
        System.out.println("area is- "+r.ar());
        Circle c= new Circle(3);
        System.out.println("area is- "+c.ar());
    }
}