package com.index;

public class LocalVar {
   public void Num() { 
	int num1=10;  //local variable 1
     int num2=20;  //local variable 2
     System.out.println("Number 1:"+num1);
     System.out.println("Number 2:"+num2);
   }  
   public static void main(String[] args) {
	   LocalVar a1=new LocalVar();
	   a1.Num();
   }
}
