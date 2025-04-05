package lancheria;

public class Pedido {
    private int quantidade;
    private Produto p;

    public Pedido() {
    }

    public Pedido(int quantidade, Produto p) {
        this.quantidade = quantidade;
        this.p = p;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getP() {
        return p;
    }

    public void setP(Produto p) {
        this.p = p;
    }
    
    public double calcularTotal(){
        double total =0;
        total = this.quantidade * p.getValor();
        return total;   
    }
    
}
