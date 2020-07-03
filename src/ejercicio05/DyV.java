package ejercicio05;

import java.util.ArrayList;

public class DyV {

	public DyV() {
		// TODO Auto-generated constructor stub
	}
	
	public int metodoDyV(ArrayList<Integer> lista, int num) {
		if(num>= lista.get(lista.size()-1)) return lista.get(lista.size()-1);
		if(num<=lista.get(0)) return lista.get(0);
		return this.metodoDyV(lista,num,0,lista.size()-1);
		
	}
	
	private int metodoDyV(ArrayList<Integer> lista, int num,int inicio, int fin) {
		
		
		
		return 0;
	}

}
