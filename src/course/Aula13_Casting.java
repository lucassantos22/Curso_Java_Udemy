package course;

public class Aula13_Casting {
	
	public static void main (String[]args) {
		
		double a;
		float b;
		
		a = 5.0;
		b = (float)a; // Casting (Convertendo vari�vel "a" em float)
		
		System.out.println(b);
		
		double c;
		int d;
		
		c = 5.6;
		d = (int)c; // Casting (Convertendo vari�vel "c" em int)
		
		System.out.println(d);
		
		int e, f;
		double result;
		
		e = 5;
		f = 2;
		
		result = (double)e/f;
		
		System.out.println(result);
	}

}
