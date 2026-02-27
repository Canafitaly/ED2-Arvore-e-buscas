package models;

public class BuscaTotais {

    void preOrdem(No atual) {
        if (atual != null) {
            System.out.print(atual.valor + " ");   // visita raiz primeiro
            preOrdem(atual.esquerda);              // depois esquerda
            preOrdem(atual.direita);               // depois direita
        }
    }
    void emOrdem(No atual) {
        if (atual != null) {
            emOrdem(atual.esquerda);
            System.out.print(atual.valor + " ");
            emOrdem(atual.direita);
        }
    }
    void posOrdem(No atual) {
        if (atual != null) {
            posOrdem(atual.esquerda);              // primeiro esquerda
            posOrdem(atual.direita);               // depois direita
            System.out.print(atual.valor + " ");   // visita raiz por último
        }
    }
}
