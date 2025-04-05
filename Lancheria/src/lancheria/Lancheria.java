package lancheria;

import java.util.Scanner;

public class Lancheria {

    public static void main(String[] args) {
        
        String resposta= "s";
        Scanner leia = new Scanner(System.in);
        Scanner resp = new Scanner(System.in);

        //Instanciamos um objeto da classe Produto vazio
        Produto p = new Produto();        
        do {
            System.out.println("Digite o nome do produto: ");
            p.setNome(leia.nextLine());
            
            System.out.println("Informe a descrição do produto: ");
            p.setDesc(leia.nextLine());
            
            System.out.println("Informe o valor do produto: ");
            p.setValor(leia.nextDouble());
            
            System.out.println("Digite a quantidade: ");
            int quantidade = leia.nextInt();

            //Adicionar produto ao pedido
            Pedido ped = new Pedido(quantidade, p);
            
            System.out.println("O total é: " + ped.calcularTotal());

            Comanda c = new Comanda();
            c.AdicionarPedidoNaLista(ped);
            
            System.out.println("Gostaria de continuar? s/n");
            String res =resp.nextLine();

        } while (resposta!=("n"));
    }
}
