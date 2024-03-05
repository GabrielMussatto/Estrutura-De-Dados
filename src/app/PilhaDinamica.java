package app;

public class PilhaDinamica<T> {
	
	private No<T> topo;
	
	public PilhaDinamica() {
		this.topo = null;
	}

	public void push (T elemento) {
		No<T> noAux = new No(elemento);
		noAux.setProximo(this.topo);
		this.topo = noAux;
	}
	
	public void pop() {
		if(topo == null)
			return;
		No<T> noAux = this.topo;
		this.topo = this.topo.getProximo();
		noAux.setProximo(null);
	}
	
	public void imprimir() {
		imprimir(topo);
	}
	
	public void imprimir(No<T> proximo) {
		if(proximo == null) {
			return;
		}
		System.out.println(proximo);
		imprimir(proximo.getProximo());           
	}
}
