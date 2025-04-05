package lancheriaheranca;
public class LancheriaHeranca {
    public static void main(String[] args) {
        Produto[] arrayProdutos = new Produto[3];
        
        arrayProdutos[0] = new Lanche("Xis Bacon", "Completo", 29.90, 1200);
        arrayProdutos[1] = new Bebida("Coquinha Geladinha", "Com gelo e limão", 14.90, 2000);
        arrayProdutos[2] = new Lanche("Pudim de Leite", "Sem Lactose", 9.99, 250);
        
        for (int i = 0; i < arrayProdutos.length; i++) {
            arrayProdutos[i].mostrarDetalhes();
            System.out.println("");
        }
        
        
    }
    
}
