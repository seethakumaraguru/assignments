package assignments;

public class Calculator {

	public static void main(String[] args) {
	
			Calculator oprgm = new Calculator();
	             oprgm.WithOutParam();
	             System.out.println("=======================");
	             oprgm.WithParam(20,15);
	             System.out.println("=======================");
	             
	            
	             int sum= oprgm.SumReturnType();
	             Calculator result =new Calculator();
	             System.out.println(""+ sum);
	            

	             int sub= oprgm.SubReturnType();
	             Calculator result1 =new Calculator();
	             System.out.println(""+ sub);
	            
	             int multiply= oprgm.MulReturnType();
	             Calculator result2 =new Calculator();
	             System.out.println(""+ multiply);
	            
	             double divi= oprgm.DivReturnType();
	             Calculator result3 =new Calculator();
	             System.out.println(""+ divi);
	            
	             // int sub= oprgm.ReturnType();
	            // int multiply= oprgm.ReturnType();
	             //double divi= oprgm.ReturnType();
	             
	             
	           //  Calculator result1 =new Calculator();
	            // System.out.println(""+ sub);
	             //System.out.println(""+ multiply);
	             //System.out.println(""+ divi);
	             
	          //  oprgm.ReturnType(sub);
	             
		}
	    public void WithOutParam() {
	    	int a=60;
	    	int b=20;
	    	int c1= a+b;
	    	int c2=a-b;
	    	int c3=a*b;
	    	double c4=a/b;
	    	
		System.out.println("print added values here: " +c1);
		System.out.println("print subracted values here: " +c2);
		System.out.println("print multiplied vales here: "+c3);
		System.out.println("print divided values here:"+c4);
	   

	    }
	    public void WithParam(int a, int b) {
	    	int sum = a+b;
	    	int sub = a-b;
	    	int multiply = a*b;
	    	double div = a/b;
	    	System.out.println("print added values here: " + sum);
			System.out.println("print subracted values here: " + sub);
			System.out.println("print multiplied vales here: "+ multiply);
			System.out.println("print divided values here:"+div);
		   
	    	}
	    public  int SumReturnType() {
	    	int a= 5;
	    	int b=7;
	    	int sum = a+b;
	    	return sum;
	    }
	    	
	    	public  int SubReturnType() {
		    	int a= 5;
		    	int b=7;
		    	int sub = a-b;
		    	return sub;
		    	

	    	}
	    	public  int MulReturnType() {
		    	int a= 5;
		    	int b=7;
		    	int multiply = a*b;
		    	double divi = a/b;
		    		   
	    	 return multiply;
	    	
	    	
	    	}
	    	public  double DivReturnType() {
		    	int a= 5;
		    	int b=7;
		    	
		    double divi = a/b;
		    		   
	    	 return divi;
	    	
	    
	    }

}

