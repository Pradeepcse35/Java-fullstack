package JavaTasks2;
//Write a Java program to create a class called "Person" with a name 
//and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age
public class Person {
	 String name;
	    int age;
	    Person(String n,int a){
	    	name =n;
	    	age=a;
	    }
    public void display() {
    	System.out.println("Person "+name+" age is "+age);
    }
    public static void main (String[] args) {
    	Person p1=new Person("Pradeep",19);
    	Person p2=new Person("Nandha",27);
    	p1.display();
    	p2.display();
    	
    }
    
}
