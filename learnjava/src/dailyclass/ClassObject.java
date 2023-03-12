package dailyclass;
//import java.lang.reflect.Array;

public class ClassObject {

	
		
	
		
			
			/**
			 * Class - It is Blue Print or Template which can hold the common properties and actions of an object .

			 * Object - It is an instance of Class.
			 * 
			 * Car  --> Class
			 *	 Properties : 
			 *		- RC
			 *		- Make
			 *		- Model
			 *		- Year
			 *		- Fuel Type
			 *		- Color
			 *		- Speed
			 *
			 *	Action : 
			 *		- Move Forward
			 *		- Move Backward
			 *		- Breaking
			 *		- Horn
			 *		- Seat Adjustment
			 *		- Air Bag
			 * 
			 */
			
			String name;
			String address;
			String type;
			long mobile;
			String email;
			String[] courses = new String[5];
			
			public void counseling() {
				System.out.println("Counseling about course");
			}
			
			public void demo() {
				System.out.println("Demo on live session");
			}
			
			public void registration() {
				System.out.println("Registration for a course");
			}
			
			public void startGroup() {
				System.out.println("Creation of a watsup group");
			}
			
			public void session() {
				System.out.println("Session started...");
			}
			
			public void information() {
				System.out.println("Institute Name : "+name);
				System.out.println("Institute Address : "+address);
				System.out.println("Institute Mobile : "+mobile);
				System.out.println("Institute Email : "+email);
				for (String course : courses) {
					System.out.println(course);
				}
			}
			
			public static void main(String[] args) {
				ClassObject oCredoVelachery = new ClassObject();
				oCredoVelachery.name = "Credo Systemz";
				oCredoVelachery.address = "Velachery";
				oCredoVelachery.email = "credovelacherry@crdosystemz.com";
				oCredoVelachery.mobile = 98745621222l;
				oCredoVelachery.courses[0] = "Selenium";
				oCredoVelachery.courses[1] = "Java";
				oCredoVelachery.courses[2] = "Full Stack";
				oCredoVelachery.courses[3] = "API";
				oCredoVelachery.courses[4] = "Angular";
				oCredoVelachery.counseling();
				oCredoVelachery.demo();
				oCredoVelachery.registration();
				oCredoVelachery.session();
				oCredoVelachery.information();
				
				
				ClassObject oCredoOMR = new ClassObject();
				oCredoOMR.name = "Credo Systemz";
				oCredoOMR.address = "OMR";
				oCredoOMR.email = "credoomr@crdosystemz.com";
				oCredoOMR.mobile = 541214545454l;
				oCredoOMR.courses[0] = "Selenium";
				oCredoOMR.courses[1] = "Java";
				oCredoOMR.courses[2] = "HTML";
				oCredoOMR.courses[3] = "API";
				oCredoOMR.courses[4] = "Dot Net";
				oCredoOMR.counseling();
				oCredoOMR.demo();
				oCredoOMR.registration();
				oCredoOMR.session();
				oCredoOMR.information();
				
			
			}

		}

	


