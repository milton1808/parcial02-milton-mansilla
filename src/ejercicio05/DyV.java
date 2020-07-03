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
		int medio=(fin+inicio)/2;
		if(this.entre(num,lista.get(medio), lista.get(medio+1))) return this.menordiferencia(num,lista.get(medio), lista.get(medio+1));
		
		if(num<=lista.get(medio)) return this.metodoDyV(lista, num, inicio, medio);
		return this.metodoDyV(lista, num, medio+1, fin);
	}
	private int menordiferencia(int num, int menor, int mayor) {
		if((mayor-num)<(num-menor)) return mayor;
		
		return menor;
	}

	private boolean entre(int numero, int menor, int mayor) {
		return (numero>=menor && numero<=mayor); 
	}

}
