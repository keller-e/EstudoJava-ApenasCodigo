package lancheriaheranca;

//Classe Pai - SUPER CLASSE
public abstract class Produto {
    private String nome;
    private String desc;
    private double valor;

    public Produto() {
    }

    public Produto(String nome, String desc, double valor) {
        this.nome = nome;
        this.desc = desc;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void mostrarDetalhes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Descrição: " + this.desc);
        System.out.println("Valor: " + this.valor);
    }
}
