package atividade1cadastrohospedes;

import java.util.Scanner;

public class Atividade1CadastroHospedes {
    
    private static final int maxHospedes = 15;
    private static String[] hospedes = new String[maxHospedes];
    private static int contador = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1- Cadastrar");
            System.out.println("2- Pesquisar");
            System.out.println("3- Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarHospede(scanner);
                    break;
                case 2:
                    pesquisarHospede(scanner);
                    break;
                case 3:
                    System.out.println("Saindo...\nAté logo!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 3);

        scanner.close();
    }

    private static void cadastrarHospede(Scanner scanner) {
        if (contador < maxHospedes) {
            System.out.print("Digite o nome do hóspede: ");
            String nome = scanner.nextLine();
            hospedes[contador] = nome;
            contador++;
            System.out.println("Hóspede cadastrado com sucesso!");
        } else {
            System.out.println("Máximo de cadastros atingido");
        }
    }

    private static void pesquisarHospede(Scanner scanner) {
        System.out.print("Digite o nome do hóspede a ser pesquisado: ");
        String nome = scanner.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < contador; i++) {
            if (hospedes[i].equals(nome)) {
                System.out.println("Hóspede " + nome + " foi encontrado no índice " + (i+1));
                encontrado = true;
                break;
            }
        }
        
        if (!encontrado) {
            System.out.println("Hóspede não encontrado");
        }
    }
}



