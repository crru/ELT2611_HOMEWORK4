class Triangle { 
	public static void main(String[] args){
	double x1=1, x2=3, x3=5, y1=1, y2=4, y3=3;
	double a,b,c, a1,a2,b1,b2,c1,c2;
	double A,B,C;
	System.out.println("\n");
	
		a1=(Math.pow((x3-x2),2));
		a2=(Math.pow((y3-y2),2));
		a=Math.sqrt((a1+a2));
		System.out.printf("a = %.3f",a);
		System.out.println("\n");

		b1=(Math.pow((x1-x3),2));
		b2=(Math.pow((y1-y3),2));
		b=Math.sqrt((b1+b2));
		System.out.printf("b = %.3f",b);
		System.out.println("\n");

		c1=(Math.pow((x2-x1),2));
		c2=(Math.pow((y2-y1),2));
		c=Math.sqrt((c1+c2));
		System.out.printf("c = %.3f",c);
		System.out.println("\n");
	
		A=Math.acos((a*a-b*b-c*c)/(-2*b*c));
		System.out.printf("A = %.3f",A);
		System.out.println("\n");
		
		B=Math.acos((b*b-a*a-c*c)/(-2*a*c));
		System.out.printf("B = %.3f",B);
		System.out.println("\n");

		C=Math.acos((c*c-b*b-a*a)/(-2*a*b));
		System.out.printf("C = %.3f",C);
		
		}
	}
