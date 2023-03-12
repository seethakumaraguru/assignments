package dailyclass;




public class ArrayMultiDimension {

	public static void main(String[] args) {
		int matrix[][] = {{10,20,30},{40,50,60},{70,80,90}};// 3*3
		/**
		 * For Loop With in a For Loop
		 */
		// matrix.length --> Size of a Row
		for(int i = 0;i < matrix.length;i++) {
			for(int j = 0;j < matrix.length; j++) {
				System.out.print(matrix[i][j]+"	");//10 20 30 40 50 60
			}
			System.out.println();
		}
		/**
		 * Patern Program
		 */
		for(int i=1;i<=5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}




	


