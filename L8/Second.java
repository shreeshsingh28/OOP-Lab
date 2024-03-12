abstract class Area{
    double ar;

    abstract void cal();

    void display(){
        cal();
        System.out.println("area is- " + ar);
    }
}

class Rectangle extends Area{
    double lenght;
    double breath;

    Rectangle(double a, double b){
        lenght = a;
        breath = b;
    }

    void cal(){
        ar = lenght * breath;
    }
}

class Circle extends Area{
    double radius;

    Circle(double a){
        radius = a;
    }

    void cal(){
        ar = 3.14 * radius * radius;
    }
}

class Second{
    public static void main(String args[]) {
        Rectangle r = new Rectangle(3,4);
        Circle c = new Circle(3);
        r.display();
        c.display();
    }
}