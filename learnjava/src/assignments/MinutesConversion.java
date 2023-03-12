package assignments;

public class MinutesConversion {

	public static void main(String[] args) {
		long minutes= 3456789l;
		
		long minutesInYear= 60 * 24 * 365;
		long years = (long) (minutes / minutesInYear);
        int days = (int) (minutes / 60 / 24) % 365;
        System.out.println ( "minutes is approximately:" +years + " years and " +  days +" days");
	}

}
