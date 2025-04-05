package atividade12quartohospedes;
import java.util.Scanner;

public class Atividade12QuartoHospedes {


    public static void main(String[] args) {
        Scanner dados1 = new Scanner(System.in);
        Scanner dados2 = new Scanner(System.in);
        
        String nome1, nome2;
        int idade1, idade2, idoso=60;
        
        
        System.out.println("***QUARTO A***\nNome do cliente: ");
        nome1= dados1.nextLine();
        System.out.println("***QUARTO A***\nIdade do Cliente: ");
        idade1=dados1.nextInt();
        
        System.out.println("----QUARTO B----\nNome do cliente: ");
        nome2= dados2.nextLine();
        System.out.println("----QUARTO B----\nIdade do Cliente: ");
        idade2=dados2.nextInt();
                
        if(idade1<idade2){
            System.out.println(nome1 + " ficara no Quarto B e " + nome2 + " ficara no Quarto A");
        }
        else if (idade1>idade2){
                    System.out.println(nome2 + " ficara no Quarto B e " + nome1 + " ficara no Quarto A");
                    }
        if(idade1>=idoso){
            System.out.println("Quarto A: " + nome1 + " (possui desconto de 40%)" + "\nQuarto B: " + nome2);
        }
        else if (idade2>=idoso){
            System.out.println("Quarto A: " + nome2 + " (possui desconto de 40%)" + "\nQuarto B: " + nome1);
        }
    }
}
