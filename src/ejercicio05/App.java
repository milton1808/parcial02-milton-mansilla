package ejercicio05;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		ArrayList<Integer> a= new ArrayList<Integer>();
		
		a.add(-6);
		a.add(-5);
		a.add(-2);
		a.add(8);
		a.add(10);
		a.add(23);
		a.add(28);
		a.add(35);
		a.add(50);
		a.add(52);
		a.add(56);
		
		DyV d=new DyV();
		
		System.out.println(d.metodoDyV(a,-8));
		
		
		
		
	}
}
