package dailyclass;

public class This_Ex {
			
			int iRollNo = 10;
			String name = "Saranaya";
			
			/**
			 * this keyword will represent current class global variable and method.
			 * When we can use the this keyword .
			 * 		- When global and local variables are same and it is assigning it to each others, then the scope is 
			 * 			going to local variable ratherthan global variable .So we can use this keyword to represent 
			 * 			global variable .
			 * 		- Whenever we return to the same class we can user this ketword .
			 * 
			 */
			
			public This_Ex(int iRollNo,String name) {
				this.iRollNo = iRollNo;
				this.name = name;
			}
			
//			public This_Ex(int i,String n) {
//				iRollNo = i;
//				name = n;
//			}
			
			public void display() {
				System.out.println("Roll No is : "+iRollNo);
				System.out.println("Name is : "+name);
				print();//this.print();
			}
			
			public void print() {
				System.out.println("This is a dummy method.");
				System.out.println("This keyword reference : "+this);
			}

			public static void main(String[] args) {
				This_Ex obj = new This_Ex(100,"Sekar");
				obj.display();
				System.out.println("Created Object : "+obj);
			}

	
	}


