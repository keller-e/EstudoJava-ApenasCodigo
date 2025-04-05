package agenciadeviagens;

public class Venda {
    
    private String nomeCliente;
    private String formaPagamento;
    private PacoteViagem pacoteViagem;

    public Venda() {
    }

    public Venda(String nomeCliente, String formaPagamento, PacoteViagem pacoteViagem) {
        this.nomeCliente = nomeCliente;
        this.formaPagamento = formaPagamento;
        this.pacoteViagem = pacoteViagem;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public PacoteViagem getPacoteViagem() {
        return pacoteViagem;
    }

    public void setPacoteViagem(PacoteViagem pacoteViagem) {
        this.pacoteViagem = pacoteViagem;
    }
    
    public double converterParaReais(double valorDolar, double cotacao) {
        return valorDolar * cotacao;
    }
    
    public void mostrarDetalhesVenda(double cotacaoDolar) {
       double totalDolar = pacoteViagem.calcularTotalPacote(cotacaoDolar);
       double totalReais = converterParaReais(totalDolar, cotacaoDolar);
       System.out.println("-------------------------------------------------------------------");
       System.out.println("Por gentileza, revise as informações da Venda:");
       System.out.println("Nome do Cliente: " + nomeCliente);
       System.out.println("Transporte: " + pacoteViagem.getTransporte().getTipoTransporte());
       System.out.println("Hospedagem: " + pacoteViagem.getHospedagem().getDescricao());
       System.out.println("Destino: " + pacoteViagem.getDestino());
       System.out.println("Quantidade de dias: " + pacoteViagem.getDias());
       System.out.println("Forma de Pagamento: " + formaPagamento);
       System.out.println("Total do Pacote (em dólares): " + totalDolar);
       System.out.println("Total do Pacote (em reais): " + totalReais);
       
       System.out.println("\n **** Obrigado por escolher nossa Agência! ****");
       System.out.println("-------------------------------------------------------------------");
    } 
}
