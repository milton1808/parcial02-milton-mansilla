package ejercicio04;


public class App {

	public static void main(String[] args) {
		Grafo<Integer> g1 = new Grafo<Integer>();
		
		g1.addNodo(4);
		g1.addNodo(8);
		g1.addNodo(12);
		g1.addNodo(16);
		g1.addNodo(20);
		g1.addNodo(15);
		g1.addNodo(35);
		g1.conectar(4, 8);
		g1.conectar(4, 12);
		g1.conectar(12, 16);
		g1.conectar(8, 12);
		g1.conectar(12, 4);
		g1.conectar(16, 20);
		g1.conectar(8, 15);
		g1.conectar(15, 35);
		
		/**     8---->15 ----->35
		 *    / |				  
		 *  4   |
		 *    \ |
		 *      12 ---> 16--->20
		 * 
		 * 
		 */
		//tienen caminos limpios
		System.out.println(g1.existeCaminoLimpio(new Vertice<Integer>(8), new Vertice<Integer>(35)));
		System.out.println(g1.existeCaminoLimpio(new Vertice<Integer>(16), new Vertice<Integer>(20)));
		System.out.println(g1.existeCaminoLimpio(new Vertice<Integer>(4), new Vertice<Integer>(12)));
		
		//no tienen caminos limpios
		System.out.println(g1.existeCaminoLimpio(new Vertice<Integer>(4), new Vertice<Integer>(16)));
		System.out.println(g1.existeCaminoLimpio(new Vertice<Integer>(8), new Vertice<Integer>(20)));
		System.out.println(g1.existeCaminoLimpio(new Vertice<Integer>(35), new Vertice<Integer>(8)));
		
		
	}
}
