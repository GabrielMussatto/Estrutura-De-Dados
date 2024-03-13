package app;

public class ListaEncadeada {
    private No inicio;

    public void inserirInicio(int valor) {
        No novoNo = new No(valor);
        if (inicio == null || valor <= inicio.valor) {
            novoNo.proximo = inicio;
            inicio = novoNo;
        } else {
            No atual = inicio;
            while (atual.proximo != null && atual.proximo.valor < valor) {
                atual = atual.proximo;
            }
            novoNo.proximo = atual.proximo;
            atual.proximo = novoNo;
        }
    }

    public void inserirFim(int valor) {
        No novoNo = new No(valor);
        if (inicio == null) {
            inicio = novoNo;
        } else {
            No atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
    }

    public void inserirMeio(int valor) {
        inserirInicio(valor);
    }

    public int removerInicio() {
        if (inicio == null) {
            return -1;
        } else {
            int valor = inicio.valor;
            inicio = inicio.proximo;
            return valor;
        }
    }

    public int removerFim() {
        if (inicio == null) {
            return -1;
        } else if (inicio.proximo == null) {
            int valor = inicio.valor;
            inicio = null;
            return valor;
        } else {
            No atual = inicio;
            while (atual.proximo.proximo != null) {
                atual = atual.proximo;
            }
            int valor = atual.proximo.valor;
            atual.proximo = null;
            return valor;
        }
    }

    public int removerMeio() {
        if (inicio == null) {
            return -1;
        } else if (inicio.proximo == null) {
            int dado = inicio.valor;
            inicio = null;
            return dado;
        } else {
            No atual = inicio;
            No avancado = inicio;
            No anterior = null;
            while (avancado != null && avancado.proximo != null) {
                avancado = avancado.proximo.proximo;
                anterior = atual;
                atual = atual.proximo;
            }
            if (anterior == null) {
                inicio = inicio.proximo;
            } else {
                anterior.proximo = atual.proximo;
            }
            return atual.valor;
        }
    }

    public int tamanho() {
        int count = 0;
        No atual = inicio;
        while (atual != null) {
            count++;
            atual = atual.proximo;
        }
        return count;
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    public void imprimirLista() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserirInicio(1);
        lista.inserirInicio(2);
        lista.inserirInicio(3);
        lista.inserirMeio(4);
        lista.inserirMeio(5);
        lista.inserirMeio(6);
        lista.inserirMeio(7);
        lista.inserirFim(8);
        lista.inserirFim(9);
        lista.removerInicio();
        lista.removerMeio();
        lista.removerFim();
        lista.imprimirLista();
    }
}
