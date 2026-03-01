package models;

public class Arvore {
    public No raiz;

    public Arvore(){
        raiz = null;
    }
    public void  inserir(int valor){
        raiz=inserirRec(raiz, valor);
    }

    public No inserirRec(No atual, int valor){
        if(atual==null){return new No(valor);}//pronto pra receber valor

        if(valor <atual.valor){
            atual.esquerda= inserirRec(atual.esquerda, valor);//indo pra esquerda
        }else if(valor > atual.valor){
            atual.direita =inserirRec(atual.direita,valor);//indo pra direita
        }

        return atual;
    }
    public No buscar(No atual, int valor) {
        if (atual == null) {
            return null; // não achou
        }
        if (atual.valor == valor) {
            return atual; // achou
        }
        if (valor < atual.valor) {
            return buscar(atual.esquerda, valor); // procura na esquerda
        } else {
            return buscar(atual.direita, valor); // procura na direita
        }
    }

}
