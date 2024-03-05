package app;

public class Principal {

	public static void main(String[] args) {
		PilhaDinamica<Integer> pilha = new PilhaDinamica();
		System.out.println("Pilha Generica");
		
		System.out.println("A Pilha está vazia? " + pilha.estaVazia());
		
		System.out.println("\nTamanho da Pilha: " + pilha.tamanho());
		
		pilha.push(1);
		pilha.push(2);
		pilha.push(3);
		pilha.push(4);
		pilha.push(5);
		pilha.push(6);
		
        System.out.println("Dados da Pilha:");
        pilha.imprimir();

        pilha.pop();
        pilha.pop();

        System.out.println("\nDados da Pilha após remover dois elementos:");
        pilha.imprimir();

        System.out.println("\nTamanho da Pilha: " + pilha.tamanho());

        System.out.println("A Pilha está vazia? " + pilha.estaVazia());
		
		System.out.println("----------");
		
		
		FilaDinamica<String> fila = new FilaDinamica();
		System.out.println("Fila Generica");
		
		System.out.println("A Fila está vazia? " + fila.estaVazia());
		
		System.out.println("\nTamanho da Fila: " + fila.tamanho());
		
		fila.push("a");
		fila.push("b");
		fila.push("c");
		fila.push("d");
		fila.push("e");
		fila.push("f");
		
		System.out.println("Dados da Fila:");
        fila.imprimir();

        fila.pop();
        fila.pop();
        fila.pop();
        fila.pop();

        System.out.println("\nDados da Fila após remover quatro elementos:");
        fila.imprimir();

        System.out.println("\nTamanho da Fila: " + fila.tamanho());

        System.out.println("A Fila está vazia? " + fila.estaVazia());
		
	}
}

