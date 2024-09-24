package JavaTasks2;

public class AddNumStatic {
  public static int addnum(int a,int b) {
	  return a+b;
  }
  public static void main(String[] args) {
	  AddNumStatic obj=new AddNumStatic();
	  int result = addnum(5,10);
	  System.out.println("Addition of two value is " +result);
  }
}
