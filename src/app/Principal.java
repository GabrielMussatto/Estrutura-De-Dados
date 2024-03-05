package app;

public class Principal {

	public static void main(String[] args) {
		PilhaDinamica<Integer> pilha = new PilhaDinamica();
		System.out.println("Pilha Generica");
		pilha.push(1);
		pilha.push(2);
		pilha.push(3);
		pilha.pop();
		pilha.push(4);
		pilha.pop();
		pilha.imprimir();
		
		System.out.println("----------");
		
		
		FilaDinamica<String> fila = new FilaDinamica();
		System.out.println("Fila Generica");
		fila.push("a");
		fila.push("b");
		fila.push("c");
		fila.pop();
		fila.push("d");
		fila.pop();
		fila.push("e");
		fila.push("f");
		fila.imprimir();
		
	}
}

