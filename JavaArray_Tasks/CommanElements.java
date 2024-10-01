package JavaArray_Tasks;
import java.util.Arrays;
public class CommanElements {

	 public static void main(String[] args) {
	  
	        int[] array1 = {10,20,30,40};
	        int[] array2 = {20,60,80,10};

	  
	        for (int i = 0; i < array1.length; i++) {
	            for (int j = 0; j < array2.length; j++) {
	            
	                if (array1[i] == (array2[j])) {
	                 
	                    System.out.println("Common element is : " + (array1[i]));
	                }
	            }
	        }
	 }
}
