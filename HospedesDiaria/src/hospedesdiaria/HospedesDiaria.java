package hospedesdiaria;
import java.util.Scanner;

public class HospedesDiaria {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Scanner dados = new Scanner(System.in);

        System.out.print("Digite o valor padrão da diária: ");
        double valorDiaria = scanner.nextDouble();

        int gratuidades = 0;
        int meias = 0;
        double total = 0;
        scanner.nextLine();
        
        while (true) {         
            System.out.print("Digite o nome do hóspede ou digete 'PARE' para finalizar sua ação): ");
            String nome = dados.nextLine();

            if (nome.equalsIgnoreCase("PARE")) {
                break;
            }
            
            System.out.print("Digite a idade de " + nome + ": ");
            int idade = dados.nextInt();

            
            if (idade <= 4) {
                System.out.println(nome + " possui gratuidade.");
                gratuidades++;                
            } else if (idade >= 80) {
                System.out.println(nome + " paga meia.");
                meias++;
                total += valorDiaria / 2;
            } else {
                total += valorDiaria;
            }
        }

        System.out.printf("Total de hospedagens: R$%.2f; %d gratuidade(s); %d meia(s)%n", total, gratuidades, meias);
    }
}