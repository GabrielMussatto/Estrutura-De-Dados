package app;

public class FilaDinamica<T> {
    private No<T> inicio;
    private No<T> fim;

    public FilaDinamica() {
        this.inicio = null;
        this.fim = null;
    }

    public void push (T elemento) {
        No<T> noAux = new No(elemento);
        if (inicio == null) {
            inicio = noAux;
            fim = noAux;
        } else {
            fim.setProximo(noAux);
            fim = noAux;
        }
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
    }

    public void imprimir() {
        imprimir(inicio);
    }

    public void imprimir(No<T> proximo) {
        if (proximo == null) {
            return;
        }
        System.out.println(proximo);
        imprimir(proximo.getProximo());
    }
}
