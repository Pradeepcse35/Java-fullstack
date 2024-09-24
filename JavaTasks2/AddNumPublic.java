package JavaTasks2;

public class AddNumPublic {
  public int add(int a,int b) {
	  
	  return a+b;
  }
  public static void main(String[] args) {
	  AddNumPublic obj=new AddNumPublic();
	  int ans=obj.add(50,87 );
	  System.out.println("Addition two number is "+ans);
  }
}
