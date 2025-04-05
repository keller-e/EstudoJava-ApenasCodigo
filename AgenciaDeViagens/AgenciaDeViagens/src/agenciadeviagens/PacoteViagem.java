package agenciadeviagens;


public class PacoteViagem {
    private Transporte transporte;
    private Hospedagem hospedagem;
    private String destino;
    private int Dias;

    public PacoteViagem() {
    }

    public PacoteViagem(Transporte transporte, Hospedagem hospedagem, String destino, int Dias) {
        this.transporte = transporte;
        this.hospedagem = hospedagem;
        this.destino = destino;
        this.Dias = Dias;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public Hospedagem getHospedagem() {
        return hospedagem;
    }

    public void setHospedagem(Hospedagem hospedagem) {
        this.hospedagem = hospedagem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getDias() {
        return Dias;
    }

    public void setDias(int Dias) {
        this.Dias = Dias;
    }
    
    public double calcularTotalHospedagem(){
        double total = 0;
        total = this.Dias * hospedagem.getValorDiaria();
        return total;
    }
    
     public double calcularLucro(){
         double margemLucro = 0;
         return (transporte.getValor() + calcularTotalHospedagem()) * (margemLucro / 100);
     }
     
     public double calcularTotalPacote (double margemLucro){
         double taxaAdicional = 0;
         double totalTransporte = transporte.getValor();
         double totalHospedagem = calcularTotalHospedagem();
         double valorLucro = calcularLucro();
         return totalTransporte + totalHospedagem + valorLucro + taxaAdicional;
     }
}
