package Main;

import Models.Cola;

public class Main {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		int n1 = 62, n2 = 1, n3 = 3, n4 = 8;

		Cola array = new Cola();
		
		System.out.println(array.toString());
		System.out.println("Elementos a añadir: " +n1+" - "+n2+" - "+n3+" - "+n4);
		System.out.println("\n[>] Añadiendo elementos... ");
		// Añadimos los elementos al array
		array.push(n1);
		array.push(n2);
		array.push(n3);
		array.push(n4);
		
		System.out.println("\nEl tamaño del array es: "+array.size());
		System.out.println(array.toString());
		
		System.out.println("\n[>] Removiendo el objeto "+n1+"...");
		array.remove(n1);
		
		System.out.println("\nEl tamaño del array es: "+array.size());
		System.out.println(array.toString());
		
		System.out.println("\n[>] Verificando si existe el elemento "+n2+"...");
		String resultado = (array.contains(n2)) ? "El elemento existe":"El elemento no existe" ;
		System.out.println(resultado);
		
		System.out.println("\n[>] Eliminando el primer elemento...");
		array.pop();
		System.out.println(array.toString());

		System.out.println("\n[>] Verificando si existen elementos...");
		String resultado2 = (array.isEmpty()) ? "Los elementos no existen":"Existen elementos" ;
		System.out.println(resultado2);
		
		System.out.println("\n[>] Eliminando todos los elementos...");
		array.clear();
		String resultado3 = (array.isEmpty()) ? "Los elementos no existen":"Existen elementos" ;
		System.out.println(resultado3);
		System.out.println(array.toString());
		
	}

}
