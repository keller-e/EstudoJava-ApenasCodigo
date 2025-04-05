package lancheria;

import java.util.ArrayList;


public class Comanda {
    private ArrayList <Pedido> ListaPedidos = new ArrayList();
    
    public void AdicionarPedidoNaLista(Pedido p){
        ListaPedidos.add(p);
    }
    
    public void ListaPedidos(){
        for (int i = 0; i < ListaPedidos.size(); i++) {
            
            System.out.println(ListaPedidos.get(i).getP().getNome());
        }
    }
    
}
