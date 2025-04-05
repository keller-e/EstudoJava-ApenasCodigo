package agenciadeviagens;

import java.util.Scanner;

public class AgenciaDeViagens {

    public static void main(String[] args) {
        Scanner dadosTransporte = new Scanner(System.in);
        Scanner dadosHospedagem = new Scanner(System.in);
        Scanner dadosViagem = new Scanner(System.in);
        Scanner dadosLucro = new Scanner(System.in);
        Scanner dadosCliente = new Scanner(System.in);
        Scanner dadosDolar = new Scanner(System.in);
        
        //INFORMACOES DE TRANSPORTE
        
        System.out.println("Bem vindo a nossa Agência de Viagens!");
        
        System.out.println("Para começarmos, informe o meio de transporte desejavel");
        System.out.println("- Ônibus\n- Avião\n- Navio");
        System.out.println("Opção: ");
        String meioTransporte = dadosTransporte.nextLine();
        
        System.out.println("Informe o valor: ");
        double valorTransporte = dadosTransporte.nextDouble();
        
        Transporte transporte = new Transporte(meioTransporte, valorTransporte);
 //--------------------------------------------------------------------------------\\ 
        //CADASTRO DE HOSPEDAGEM
        
        System.out.println("\nInformações sobre a Hospedagem\n"
                + " - Informe a descrição e valor de estadia");
        System.out.println("Exemplo de descrição: Hotel com Vista para o mar, 1 Quarto, 1 Banheiro, 1 Cozinha\n");
        
        System.out.println("Descrição do lugar: ");
        String descricaoHospedagem = dadosHospedagem.nextLine();
        
        System.out.println("Valor da diária: ");
        double valordiaria = dadosHospedagem.nextDouble();
        
        Hospedagem hospedagem = new Hospedagem(descricaoHospedagem, valordiaria);
 //--------------------------------------------------------------------------------\\       
        //CADASTRO DO PACOTE DE VIAGEM 
        
        System.out.println("\nInformações do Pacote de viagem");
        
        System.out.println("Informe seu destino (País e cidade)");
        System.out.println("*Exemplo: Brasil, Rio de Janeiro*\n");
        System.out.println("Destino: ");
        String descricaoviagem = dadosViagem.nextLine();
        
        System.out.println("Quantidade de dias que deseja se Hospedar: ");
        int qtdDias = dadosViagem.nextInt();
        
        PacoteViagem pacoteViagem = new PacoteViagem(transporte, hospedagem, descricaoviagem, qtdDias);        
//--------------------------------------------------------------------------------\\
        //MARGEM DE LUCRO
        //INFORMAÇÕES PREENCHIDAS PELO FUNCIONÁRIO
        System.out.println("\nInforme a margem de lucro: ");
        double margemLucro = dadosLucro.nextDouble();
        
        System.out.print("Informe a taxa adicional de viagem: ");
        double taxaAdicional = dadosLucro.nextDouble();
        
        double totalPacote = pacoteViagem.calcularTotalPacote(margemLucro);
        System.out.println("Prévia do valor total do Pacote (em dólares): " + totalPacote + taxaAdicional);
//--------------------------------------------------------------------------------\\
        //CADASTRO DE VENDA
        System.out.println("\nPara o proximo passo, faremos o cadastro de venda");
        System.out.println("Nome do cliente: ");
        String nomeCliente = dadosCliente.nextLine();
        
        System.out.println("- Para pagamento contamos com as modalidades PIX, DÉBITO E CRÉDITO");
        System.out.println("Forma de pagamento: ");
        String formaPagameto = dadosCliente.nextLine();
        
        Venda venda = new Venda(nomeCliente, formaPagameto, pacoteViagem);

        System.out.print("- Informe a cotação do dólar atualmente: ");
        double cotacaoDolar = dadosDolar.nextDouble();

        venda.mostrarDetalhesVenda(cotacaoDolar);
    }   
}