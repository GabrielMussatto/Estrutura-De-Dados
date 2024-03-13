package app;

public class PilhaDinamica<T> {

	private No<T> topo;
	private int tamanho;

	public PilhaDinamica() {
		this.topo = null;
		this.tamanho = 0;
	}

	public void push(T elemento) {
		No<T> noAux = new No<>(elemento);
		noAux.setProximo(this.topo);
		this.topo = noAux;
		this.tamanho++;
	}

	public void pop() {
		if (topo == null)
			return;
		No<T> noAux = this.topo;
		this.topo = this.topo.getProximo();
		noAux.setProximo(null);
		this.tamanho--;
	}

	public int tamanho() {
		return this.tamanho;
	}

	public boolean estaVazia() {
		return this.tamanho == 0;
	}

	public void imprimir() {
		imprimir(topo);
	}

	private void imprimir(No<T> proximo) {
		if (proximo == null) {
			return;
		}
		System.out.println(proximo.getElemento());
		imprimir(proximo.getProximo());
	}
}
