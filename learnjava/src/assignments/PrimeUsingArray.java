package assignments;

public class PrimeUsingArray {

	public static void main(String[] args) {
		
		
		PrimeUsingArray oassignment = new PrimeUsingArray();
		oassignment.ForLoopPrime();
		System.out.println("***********For loop using Prime********");
		oassignment.ForEachPrime();
		System.out.println("***********For Each using Prime********");
		
	}
		
		public void ForLoopPrime() {
		  int c[] = {56,643,76,423,43,7,3,43};
		  boolean flag =false;
		  for(int i=0;i<c.length;i++){
			  
		      if (c[i]% 2== 0) {
			    flag = true;
			    System.out.println(c[i] + " is a prime number.");
			     continue;
			      }
			    if (flag)
				   // System.out.println(c[i] + " is a prime number.");
				    //else
				    System.out.println(c[i] + " is not a prime number.");
		  
		  }}
	  public void ForEachPrime() {
		  int d[]= {56,643,76,423,43,7,3,43};
		  for(int value :d) {
	//	System.out.println(value);
		  
		  boolean flag =false;
			  for(int j=2;j<value;j++) {
			  if(value%2==0) {
				  flag = true;
				  continue;
		  }}
			  if (!flag)
				    System.out.println(value + " is a prime number.");
				    else
				    System.out.println(value + " is not a prime number.");
			  }}
	

}
