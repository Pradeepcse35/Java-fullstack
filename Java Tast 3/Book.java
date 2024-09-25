package JavaTasks2;

public class Book {
   String title,author;
   int price;
   Book(String t,String a){
	   title = t;
	   author = a;
   }
   Book (String t,String a,int p){
	   title =t;
	   author =a;
	   price =p;
   }
   void display() {
	   System.out.println("The Book "+title+" Writtern by "+author+"cost "+price);
	   }
   public static void main (String[] args) {
	   Book b1=new Book("Thirukural","Thiruvalluvar");
	   Book b2=new Book("The War","Shakespeare",200);
	   b1.display();
	   b2.display();
	   
   }
}
