package JavaTasks2;
//Write a Java program to create a class called "Rectangle" with width and height attributes.
//Calculate the area and parameter of the rectangle.
public class Rectangle {
     float width,height;
     Rectangle(float w,float h){
    	 width=w;
    	 height=h;
     }
     public float area() {
    	 return width*height;	 
     }
     public float perimeter() {
    	 return 2*(width+height);
     }
     public float width() {
    	 return width;
     }
     public float height() {
    	 return height;
     }
     public static void main(String[] args) {
    	 Rectangle r=new Rectangle(5,6);
    	 System.out.println("Width: "+r.width());
    	 System.out.println("Height: "+r.height());

    	 System.out.println("Area: "+r.area());

    	 System.out.println("Perimeter: "+r.perimeter());

     }
}
