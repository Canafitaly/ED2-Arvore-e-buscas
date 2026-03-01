package views;

import controllers.ControllerDeArvore;

import java.util.Scanner;

public class InterfaceDeFuncoes {
    Scanner leia =new Scanner(System.in);
    ControllerDeArvore controle=new ControllerDeArvore();
    int resposta;
    public void arvore(){
        do {
            System.out.println("Arvore Binaria");
            System.out.println();
            System.out.println("escolha uma opção de atividade pelo numero:");
            System.out.println("1.Incerir");
            System.out.println("2.Buscar");
            System.out.println();
            System.out.println("BuscarTotais ");
            System.out.println("3.PreOrdem");
            System.out.println("4.EmOrdem");
            System.out.println("5.PosOrdem");
            System.out.println("6.Em Profundidade");
            System.out.println();
            System.out.println("0.encerrar programa");

            resposta=leia.nextInt();
            String valor;
            switch (resposta){
                case 1:
                    System.out.println();
                    System.out.println("escreva o valor:");
                    valor= leia.next();
                    controle.trasformer(valor,1);
                    break;
                case 2:
                   System.out.println();
                   System.out.println("escreva o valor:");
                   valor= leia.next();
                   controle.trasformer(valor,2);
                   break;
                case 3:
                    System.out.println("Lista pre ordem: ");
                    controle.trasformer(null,3);
                    break;
                case 4:
                    System.out.println("Lista em ordem: ");
                    controle.trasformer(null,4);
                    break;
                case 5:
                    System.out.println("Lista pos ordem:");
                    controle.trasformer(null,5);
                    break;
                case 6:
                    System.out.println("Lista BFS por altura:");
                    controle.trasformer(null,6);
                    break;
            }


        }while (resposta!=0);
    }
}
