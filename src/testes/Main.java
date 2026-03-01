import controllers.ControllerDeArvore;
import models.Arvore;
import models.BuscaTotais;
//esse main é voltado a testes
void main() {
    Arvore arvore= new Arvore();

    System.out.println("valores a entrar: 12,23,24,15,2,3");

    arvore.inserir(12);
    arvore.inserir(23);
    arvore.inserir(24);
    arvore.inserir(15);
    arvore.inserir(2);
    arvore.inserir(3);

    System.out.println(arvore.buscar(arvore.raiz,12));
    System.out.println(arvore.buscar(arvore.raiz,23));
    System.out.println(arvore.buscar(arvore.raiz,24));
    System.out.println(arvore.buscar(arvore.raiz,15));
    System.out.println(arvore.buscar(arvore.raiz,2));
    System.out.println(arvore.buscar(arvore.raiz,3));

    BuscaTotais buscatotais=new BuscaTotais();

    buscatotais.posOrdem(arvore.raiz);
    buscatotais.emOrdem(arvore.raiz);
    buscatotais.posOrdem(arvore.raiz);

    ControllerDeArvore controle= new ControllerDeArvore();
    //3 2 15 24 23 12
    controle.incerirNaArvore(3 );
    controle.incerirNaArvore(2);
    controle.incerirNaArvore(15);
    controle.incerirNaArvore(23);
    controle.incerirNaArvore(12);
    controle.buscarValor(2);
    controle.buscarValor(3);
    controle.buscarValor(15);
    controle.buscarValor(23);
    controle.buscarValor(12);
    controle.buscarValor(99);

    controle.trasformer(null,6);


}
