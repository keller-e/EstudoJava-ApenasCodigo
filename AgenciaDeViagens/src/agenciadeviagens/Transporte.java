package agenciadeviagens;


public class Transporte {
    
    private String tipoTransporte;
    private double valor;

    public Transporte() {
    }
    
    public Transporte(String tipoTransporte, double valor) {
        this.tipoTransporte = tipoTransporte;
        this.valor = valor;
    } 

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
   
}
