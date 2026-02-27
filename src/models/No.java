package models;

public class No {
    int valor;
    //meio que uma alto associação
    public No esquerda;
    public No direita;

    No(int valor){
        this.valor=valor;
        this.direita=null;
        this.esquerda=null;
    }
}
