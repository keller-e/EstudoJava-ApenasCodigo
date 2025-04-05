package lancheriaheranca;
public class Bebida extends Produto {
    private int mls;

    public Bebida() {
    }

    
    
    public Bebida(String nome, String desc, double valor, int mls) {
        super(nome, desc, valor);
        this.mls = mls;
    }

    public int getMls() {
        return mls;
    }

    public void setMls(int mls) {
        this.mls = mls;
    }
    
    @Override
    public void mostrarDetalhes(){
        super.mostrarDetalhes();
        System.out.println("Tamanho da bebida: " + this.mls);
    }
}
