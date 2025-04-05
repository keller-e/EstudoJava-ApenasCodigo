package lancheriaheranca;

public class Lanche extends Produto{

    private int valorCalorico;

    public Lanche() {
    }

    public Lanche(String nome, String desc, double valor, int valorCalorico) {
        super(nome, desc, valor);
        this.valorCalorico = valorCalorico;
    }

    public int getValorCalorico() {
        return valorCalorico;
    }

    public void setValorCalorico(int valorCalorico) {
        this.valorCalorico = valorCalorico;
    }
    
    //Sobreescrita de método
    /*Para que aconteça a sobreescrita de qualquer método
    Eles necessitam ter a MESMA assinatura OU SEJA o mesmo nome*/
    @Override
    public void mostrarDetalhes(){
        super.mostrarDetalhes();
        System.out.println("Valor Calórico: " + this.valorCalorico);
    }
}
