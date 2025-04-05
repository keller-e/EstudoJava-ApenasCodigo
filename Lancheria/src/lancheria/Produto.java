package lancheria;
public class Produto {
    
    //Atributos PRIVADOS
    private int id;
    private String nome;
    private String desc;
    private double valor;
    
    //Método construtor completo
    public Produto(String nome, String desc, double valor) {
        this.nome = nome;
        this.desc = desc;
        this.valor = valor;
    }

    //Método construtor vazio
    public Produto() {      
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
    
    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Descrição: " + getDesc());
        System.out.println("Valor: " + getValor());
        desconto();
    }
    
    public void desconto() {
        if (getValor() > 20) {
            System.out.println("Desconto aplicado");
        } else {
            System.out.println("Valor muito baixo pra desconto");
        }
    }
    
}
