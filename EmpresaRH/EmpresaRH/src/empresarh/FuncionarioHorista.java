package empresarh;

public class FuncionarioHorista extends Funcionarios {
    private int horasTrabalhadas;
    private double valorHora;
   //-------------------------------------------------------------
    
    public FuncionarioHorista() {}
        
    public FuncionarioHorista(String nome, String cpf, String endereco, String telefone, String setor,int horasTrabalhadas, double valorHora) {
        super(nome, cpf, endereco, telefone, setor);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    //METODOS ---------------------------------------------
    
    @Override
    public double calcularPagamento() {
        double total = 0;
        total= this.horasTrabalhadas * this.valorHora;   
        return total;
    }
    
    public void aplicarAumento(double percentual){
    this.valorHora += this.valorHora + percentual;
    }
    
    public void dadosFuncionarios(){
        super.dadosFuncionarios();
        System.out.println("Salário (Hora): " + this.valorHora);
    }
}
