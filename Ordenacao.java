package com.mycompany.manipulacaodelistas;

import java.util.Scanner;
        
public class Ordenacao {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lista lista = new Lista();

        int opcao;
        do {
            System.out.println("(1) Inserir Novo Elemento");
            System.out.println("(2) Remover Elemento");
            System.out.println("(3) Buscar Elemento");
            System.out.println("(4) Imprimir Elementos");
            System.out.println("(0) Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("1. Inserir no Inicio");
                    System.out.println("2. Inserir no Fim");
                    System.out.println("3. Inserir por Posicao");
                    System.out.print("Escolha uma opcao: ");
                    int escolhaInserir = scanner.nextInt();
                    System.out.print("Digite o valor a ser inserido: ");
                    int valorInserir = scanner.nextInt();
                    switch (escolhaInserir) {
                        case 1:
                            lista.inserirNoInicio(valorInserir);
                            break;
                        case 2:
                            lista.inserirNoFim(valorInserir);
                            break;
                        case 3:
                            System.out.print("Digite a posicao em que deseja inserir: ");
                            int posicaoInserir = scanner.nextInt();
                            lista.inserirPorPosicao(valorInserir, posicaoInserir);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("\n1. Remover no Inicio");
                    System.out.println("2. Remover no Fim");
                    System.out.println("3. Remover por Valor");
                    System.out.print("Escolha uma opcao: ");
                    int escolhaRemover = scanner.nextInt();
                    System.out.print("Digite o valor a ser removido: ");
                    int valorRemover = scanner.nextInt();
                    lista.removerElemento(valorRemover, escolhaRemover);
                    break;
                case 3:
                    System.out.print("Digite o valor a ser buscado: ");
                    int valorBuscar = scanner.nextInt();
                    if (lista.buscarElemento(valorBuscar)) {
                        System.out.println("\nElemento encontrado na lista.\n");
                    } else {
                        System.out.println("\nElemento não encontrado na lista.\n");
                    }
                    break;
                case 4:
                    System.out.println("\nElementos na lista:");
                    lista.imprimirLista();
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.\n");
                    break;
            }
        } while (opcao != 0);
    }
}