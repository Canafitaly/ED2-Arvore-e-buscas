package controllers;

import models.Arvore;
import models.BuscaBFS;
import models.BuscaTotais;



public class ControllerDeArvore {
    Arvore arvore;
    BuscaTotais buscaTotais;
    BuscaBFS buscabts;
    public ControllerDeArvore() {
        arvore = new Arvore();
        buscaTotais= new BuscaTotais();
        buscabts=new BuscaBFS();
    }

    public void trasformer(String valorbruto,int escolhido){
        int valor=0;
        if(valorbruto!=null) {
            valor = Integer.parseInt(valorbruto);
        }
        boolean respostas;
        switch (escolhido){
            //direto da arvore
            case 1:
                incerirNaArvore(valor);
                break;
            case 2:
                buscarValor(valor);
                break;

            //buscas totais
            case 3:
                buscaTotais.preOrdem(this.arvore.raiz);
                break;
            case 4:
                buscaTotais.emOrdem(this.arvore.raiz);
                break;
            case 5:
                buscaTotais.posOrdem(this.arvore.raiz);
                break;

            //buscaBFS
            case 6:
                buscabts.bfsPorAltura(this.arvore.raiz);
                break;
        }

    }


    public void incerirNaArvore(int valor){
        this.arvore.inserir(valor);
    }
    public void buscarValor(int valor){


        if(this.arvore.buscar(this.arvore.raiz,valor)==null){
            System.out.println("valor não encontrado");
        }else {
            System.out.println("O valor: "+valor+ " esta na arvore");
        }

    }




}
