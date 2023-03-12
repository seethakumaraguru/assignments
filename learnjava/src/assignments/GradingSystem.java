package assignments;

import dailyclass.variable;

public class GradingSystem {
	
	public static  void main(String[] args) {
		
	//	int mark =50;
		
		GradingSystem oGrade = new GradingSystem();
		 
		oGrade.check();
	}

		
	

	 public void check() {
			
		    int mark =50; 
			if(mark < 25 ) {
				System.out.println("F");
			}else if(mark >=25 && mark < 45) {
				System.out.println("E");
			}else if(mark >=45 && mark < 50 ) {
				System.out.println("D");
			}else if(mark >=50 && mark < 60) {
				System.out.println("C");
			}else if(mark >=60 && mark < 80) {
				System.out.println("B");
			}else if(mark >=80  ) {
				System.out.println("A");
			}else {
				System.out.println("invalid");
			}
	 }
}
	