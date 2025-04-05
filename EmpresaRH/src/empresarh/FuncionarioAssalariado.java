package empresarh;

public class FuncionarioAssalariado extends Funcionarios {
    private double salarioMensal;
   //-------------------------------------------------------------
    
    public FuncionarioAssalariado() {}

    public FuncionarioAssalariado(String nome, String cpf, String endereco, String telefone, String setor, double salarioMensal) {
        super(nome, cpf, endereco, telefone, setor);
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
    
    //METODOS ---------------------------------------------
    
    @Override
    public double calcularPagamento() {
        return this.salarioMensal;
    }
    
    public void aplicarAumento(double percentual){
    this.salarioMensal += this.salarioMensal + percentual;
    }
    
    public void dadosFuncionarios(){
        super.dadosFuncionarios();
        System.out.println("Salário mensal: " + this.salarioMensal);
    }
}
