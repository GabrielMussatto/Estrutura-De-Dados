package app;

public class FilaDinamica<T> {
	private No<T> inicio;
	private No<T> fim;
	private int tamanho;

	public FilaDinamica() {
		this.inicio = null;
		this.fim = null;
		this.tamanho = 0;
	}

	public void push(T elemento) {
		No<T> noAux = new No<>(elemento);
		if (inicio == null) {
			inicio = noAux;
			fim = noAux;
		} else {
			fim.setProximo(noAux);
			fim = noAux;
		}
		tamanho++;
	}

	public void pop() {
		if (inicio == null)
			return;
		No<T> noAux = inicio;
		inicio = inicio.getProximo();
		noAux.setProximo(null);
		if (inicio == null) {
			fim = null;
		}
		tamanho--;
	}

	public int tamanho() {
		return this.tamanho;
	}

	public boolean estaVazia() {
		return this.tamanho == 0;
	}

	public void imprimir() {
		imprimir(inicio);
	}

	private void imprimir(No<T> proximo) {
		if (proximo == null) {
			return;
		}
		System.out.println(proximo.getElemento());
		imprimir(proximo.getProximo());
	}
}
