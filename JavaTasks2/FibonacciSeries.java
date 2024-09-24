package JavaTasks2;
import java.util.Scanner;
public class FibonacciSeries {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the number of terms 10: ");
	        int n = scanner.nextInt();
	        
	       
	        int a = 0, b = 1;
	        
	        System.out.println("Fibonacci Series up to " + n + " terms:");
	        
	        for (int i = 1; i <= n; i++) {
	            System.out.print(a + " ");
	            
	           
	            int nextTerm = a + b;
	            a = b;  
	            b = nextTerm;  
	        }
	 }
}
