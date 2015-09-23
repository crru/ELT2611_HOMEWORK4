public class Triangle {
	public static void main(String[] args) {
	double x1=1,x2=3,x3=5,y1=1,y2=4,y3=3;
	double a,b,c;
	double ab,ba,ca;
	
	System.out.printf("a = %.4f\n",a=Math.sqrt((Math.pow((x3-x2),2)+((Math.pow((y3-y2),2))))));
	System.out.printf("b = %.4f\n",b=Math.sqrt((Math.pow((x3-x1),2)+((Math.pow((y3-y1),2))))));
	System.out.printf("c = %.4f\n",c=Math.sqrt((Math.pow((x2-x1),2)+((Math.pow((y2-y1),2))))));
	System.out.println("\n");
	System.out.println("##########\n");	
	System.out.printf("A = %.4f\n",ab=Math.acos((a * a - b * b - c * c)/(-2 * b * c)));
	System.out.printf("B = %.4f\n",ba=Math.acos((b * b - a * a - c * c)/(-2 * a * c)));
	System.out.printf("C = %.4f\n",ca=Math.acos((c * c - b * b - a * a)/(-2 * a * b)));
	}
}	
