package assignments;

public class StarProgramArray {
	public static void main(String[] args) {
	StarProgramArray oassignment = new StarProgramArray();
		oassignment.tristar();
		System.out.println("======================");
		StarProgramArray oassignments = new StarProgramArray();
		oassignments.fullstar();
		System.out.println("======================");
		StarProgramArray ostar = new StarProgramArray();
		ostar.RevTriStar();
		System.out.println("======================");
		StarProgramArray onumber = new StarProgramArray();
		onumber.numbers();
}

	public  void tristar () {
		for(int i=1;i<=5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*" +" ");
			}
			System.out.println();
		}

	}
public void fullstar () {
	for (int i=0;i<6;i++){
		for(int j=0;j<6;j++){
			System.out.print(" *");
		}
		System.out.println();
		}
	}
public void RevTriStar()		 
		    {
		   
		 
		    for (int i=0; i<5 ; i++)
		    {
		    for (int j=5; j>i; j--)
		    {
		    System.out.print("*" + " ");
		    }
		    System.out.println();
		    }
		    
		    }
public void numbers()
{
	for(int i=1;i<4;i++) {
	System.out.println(" "+i);
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" "+j);
		}
	}
		
}
}
}
