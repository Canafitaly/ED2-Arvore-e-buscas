package models;

public class No {
    public int valor;
    //meio que uma alto associação
    public No esquerda;
    public No direita;

    public No(int valor){
        this.valor=valor;
        this.direita=null;
        this.esquerda=null;
    }
}
