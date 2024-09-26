package JavaTasks2;


interface Shape {
    double getArea();
}

class Rec implements Shape {
    double length;
    double width;

    public Rec(double l, double w) {
         length =l;
        width =w;
    }

    
    public double getArea() {
        return length * width;
    }
}

class Circle implements Shape {
       double radius;

    public Circle(double r) {
    	radius = r;
    }

    
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle implements Shape {
     double base;
    double height;

    public Triangle(double b, double h) {
         base = b;
         height =h ;
    }

    
    public double getArea() {
        return 0.5 * base * height;
    }
}

public class Interface  {
    public static void main(String[] args) {
        Rec rectangle = new Rec(7, 5);
        Circle circle = new Circle(3.5);
        Triangle triangle = new Triangle(4.5, 6);

        System.out.println("Area of Rectangle : " + rectangle.getArea());
        System.out.println("Area of Circle : " + circle.getArea());
        System.out.println("Area of Triangle : " + triangle.getArea());
    }
}
