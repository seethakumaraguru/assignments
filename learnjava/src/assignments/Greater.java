package assignments;

public class Greater {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		if(a>b)
		System.out.println("a is greater");
		else
		System.out.println("b is greater");
		//Greater.ifElseIfElseCondition();
	//	System.out.println("******");
   //Greater oThree = new Three
		Greater oThree = new Greater();
    		oThree.ifElseIfElseCondition();
	}
	
   public static void ifElseIfElseCondition () {
	   int x=10;
	   int y=20;
	   int z=30;
	   if(x>y && x>z )
		   System.out.println("x is greater");
	   else if(y>z && y>x)
		   System.out.println("y is greater");
	   else  
	   System.out.println("z is greater");
   }
}
