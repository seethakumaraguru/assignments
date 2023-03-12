package assignments;

public class EvenOddUsingArray {

	public static void main(String[] args) {
		
		EvenOddUsingArray oassignment = new EvenOddUsingArray();
		oassignment.ForloopArray();
		System.out.println("***********For loop using EVEN or ODD*****************************");
		oassignment.ForEachArray();
        System.out.println("***********"
        		+ "For Each using EVEN or ODD*****************************");
	}
		
		
		public void ForloopArray() {
		int a[] = {10,20,60,40,30,70,20,90,120,190,110,200};
		System.out.println("Size of A is : "+a.length);
		for(int i=0;i<a.length;i++) {
			if (a[i]%2==0)
			System.out.println(a[i] + " I value is Even");
			if(a[i]%2==1)
				System.out.println( a[i] + " I value is Odd " );
			continue;
		}}
		public void ForEachArray () {
			int b[]= {89,43,67,48,92,54,943,656,4234435,849};
			for(int value : b) {
				//System.out.println(value);
				if (value%2==0)
					System.out.println(value + " value is Even");
					if(value%2==1)
						System.out.println( value + " value is Odd " );
					continue;
		}
			
		}
  
  }
