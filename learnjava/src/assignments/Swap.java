package assignments;

public class Swap {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("before swapping a:"+a + " before swapping b:" +b);
        int c = a;
        a=b;
        b=c;
        System.out.println("a="+a);
        System.out.println("b="+b);
       // withouttemp();
        Swap oSwapping = new Swap();
       oSwapping.withouttemp();
	}
	public static void withouttemp() {
		int x=12;
		int y= 18;
		x=y-x;
		y=y-x;
		x=x+y;
		System.out.println("values of x is:"+x +" value of y is:"+y);
	}
}
