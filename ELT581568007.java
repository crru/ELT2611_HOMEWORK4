public class Triangle { 
	public static void main(String[] args){

	double x1 = 1, x2 = 3,x3 = 5, y1 = 1, y2 = 4, y3 = 3 ;
	double a = 0, b = 0,c = 0;
	double aa,bb,cc ;
	double a1 = 0 , a2 = 0 , b1 = 0 , b2 = 0 ,c1 = 0 , c2 = 0 ;

	System.out.println("\n");

	a1=(Math.pow((x3-x2),2));
	a2=(Math.pow((y3-y2),2));
	a=Math.sqrt((a1+a2));
		System.out.printf("\t\t\t\ta = %4.4f", a);

	System.out.println("\n");

	b1=(Math.pow((x1-x3),2));
	b2=(Math.pow((y1-y3),2));
	b=Math.sqrt((b1+b2));
		System.out.printf("\t\t\t\tb = %4.4f", b);

	System.out.println("\n");

	c1=(Math.pow((x1-x2),2));
	c2=(Math.pow((y1-y2),2));
	c=Math.sqrt((c1+c2));
		System.out.printf("\t\t\t\tc = %4.4f", c);

	System.out.println("\n");
	System.out.println("--------------------------------------------------------------------------------");
	System.out.println("\n");

	aa=Math.acos((a*a-b*b-c*c)/(-2*b*c));
		System.out.printf("\t\t\t\tA = %4.4f", aa);

	System.out.println("\n");

	bb=Math.acos((b*b-a*a-c*c)/(-2*a*c));
		System.out.printf("\t\t\t\tB = %4.4f", bb);

	System.out.println("\n");

	cc=Math.acos((c*c-b*b-a*a)/(-2*a*b));
		System.out.printf("\t\t\t\tC = %4.4f", cc);

	System.out.println("\n");


		}
	}
