public class Triangle {
    public static void main(String[] args) {
		double A,B,C,a,b,c;
			a = 2.2361;
			b = 4.4721;
			c = 3.6056;
			A = 0.0;
			B = 0.0;
			C = 0.0;
			
				A = Math.acos((a*a - b*b - c*c)/(-2 * b * c));
				B = Math.acos((b*b - a*a - c*c)/(-2 * a * c));
				C = Math.acos((c*c - b*b - a*a)/(-2 * b * a));
			
			
			System.out.printf(" A :" +"%.4f",A);
			
			
			System.out.printf(" B :" +"%.4f",B);
			
			
			System.out.printf(" C :" +"%.4f",C);
				
	
	
	
	
	
	
	
	}
	
	}
