package atividade1quartoshotel;

import java.util.Scanner;

public class Atividade1QuartosHotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean[][] hotel = new boolean[4][3];
        
        while (true) {
            System.out.print("Informe o andar (1 a 4): ");
            int andar = scanner.nextInt();
            System.out.print("Informe o número do quarto (1 a 3): ");
            int quarto = scanner.nextInt();

           
            if (andar >= 1 && andar <= 4 && quarto >= 1 && quarto <= 3) {
                hotel[andar - 1][quarto - 1] = true;
            } else {
                System.out.println("Entrada inválida. Tente novamente.");
                continue;
            }

        
            System.out.print("Deseja informar outra ocupação? (S/N): ");
            char resposta = scanner.next().toUpperCase().charAt(0);
            if (resposta == 'N') {
                break;
            }
        }

        System.out.println("\nOcupação do hotel:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%dº andar:\n", i + 1);
            for (int j = 0; j < 3; j++) {
                String status = hotel[i][j] ? "ocupado" : "desocupado";
                System.out.printf("- Quarto %d %s\n", j + 1, status);
            }
        }
        scanner.close();
    }
}
