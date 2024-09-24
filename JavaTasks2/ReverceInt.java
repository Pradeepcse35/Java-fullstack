package JavaTasks2;
import java.util.Scanner;
public class ReverceInt {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter an integer to reverse: ");
	        int a = scanner.nextInt();  
	        int b = 0;  
	        
	        int originalNumber = a;

	        while (a != 0) {
	       
	            int lastDigit = a % 10;
	       
	            b = b * 10 + lastDigit;
	      
	            a /= 10;
	        }
	        
	        System.out.println("Reversed integer of " + originalNumber + ": " + b);
	        
	        scanner.close();
	    }
	

}
