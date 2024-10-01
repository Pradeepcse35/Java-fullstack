package JavaArray_Tasks;

import java.util.Arrays;
import java.util.Scanner;


public class ReverseArray {

    public static void reverseArray(int[] array){
		int l=0;
		int r=array.length-1;
		while(l<r) {
			int temp=array[l];
			array[l]=array[r];
			array[r]=temp;
			l++;
			r--;		
		}		
		
	}
    public static void main(String [] args) {
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter the size of array");
    	int size=s.nextInt();
    	
    	int[] array=new int[size];
    	System.out.println("Enter the elements of an array");
    	for(int i=0;i<size;i++) {
    		array[i]=s.nextInt();
    	}
    	reverseArray(array);
    	System.out.println("The Reveresed Array"+Arrays.toString(array));
    }
	
}
