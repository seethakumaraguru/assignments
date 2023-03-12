package dailyclass;

public class Array {
	

		public static void main(String[] args) {
			/**
			 * Array - It is used to group the same data type with one variable name .
			 * Array index will always starts with 0 .
			 * 
			 * Drawback : 
			 * 		- Array size is fixed, We can not increase or decrease the size of an Array during RUN TIME .
			 * 		- Using Array we can store and retrive value from an array . We can not update or delete the 
			 * 		  existing value from an array .
			 * 
			 * Types : 
			 * 		- Single Dimension Array.
			 * 		- Multi Dimension Array.
			 * 
			 */
			
			int a[] = {10,20,60,40,30,70,20,90,120,190,110,200}; // Size 8 (0-7)
			int []b = {10,20,60,40,30,70,20,90}; 
			int [] c = {10,20,60,40,30,70,20,90};
			int[] d = {10,20,60,40,30,70,20,90,100,110};
			int e[] = new int[5];
			e[0] = 141;
			e[1] = 157;
			System.out.println("Size of A is : "+a.length);
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i]);
			}
			System.out.println("************For Each************");
			// For Each - It will retrive value based on Value
			for(int value : a) {
				System.out.println(value);
			}
		
			
		}

	}



