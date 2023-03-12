package assignments;

import java.util.Scanner;

public class InputFromConsole {
	/**public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		//System.out.print("enter value:");
		//int num=input.nextInt();
	    int array[] = new int[2]; 
		System.out.print("enter value:");
		//for (int i=0; i < array.length; i++) {
		 //     System.out.print(array[i]+"\t");
		 //   }
		System.out.println("\n\n***Initializing Array***");
	    System.out.println("Enter "+ array.length
	                     + " integer values:");

	    for(int i=0; i < array.length; i++) {
	      // read input
	      array[i] = input.nextInt();
	    }
	    System.out.println("Array elements are:");
	    for (int i=0; i < array.length; i++) {
	      System.out.print(array[i]+"\t");
	    }
		//int array[] =input.nextInt[2];

	}


}**/

	public static void main(String args[]) {
		Scanner gettinginput = new Scanner(System.in);
		System.out.println("enter array length");
		int arraylength=gettinginput.nextInt();
	//	int array[]=new int[10];
		int array[]=new int[arraylength];
		System.out.println("enter "+array.length +" values here:");
		for(int i=0;i<array.length;i++){
		array[i]=gettinginput.nextInt();
		}
		
	//	System.out.println("given values are:");
		//for(int i=0;i<array.length;i++){
	//	System.out.print(array[i]+" ");
		gettinginput.close();
		
		
		for(int i=0;i<array.length;i++)
		
				
		 {
			if (array[i]%2==0)
			System.out.println(array[i] + "  is Even");
			if(array[i]%2==1)
				System.out.println( array[i] + "  is Odd " );
			continue;
	}
	}
	
	
	
	
	
}
