package dailyclass;

public class typecasting {
	

		public static void main(String[] args) {
			/**
			 * TypeCasting - Conveting from one data type to an another data type.
			 * Types : 
			 * 		Widening Casting or Implict Casting - Converting from small data type to large data type .
			 * 		Narrowing Casting or Explicit Casting - Converting from large data type to small data type .
			 */
			
			byte b = 100;
			int ib = b;
			System.out.println("Widening Casting or Implict Casting : "+ib);
			
			int age = 150;
			byte bAge = (byte)age;
			System.out.println("Byte Age : "+bAge);
		}

	}


