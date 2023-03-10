
package Ejercicio2;
import java.util.ArrayList;
public class Carrito {
    private ArrayList<ItemCarrito> items = new ArrayList<>();

    public Carrito() {
    }

    public void setItems(ItemCarrito item) {
        this.items.add(item);
    }

    public ArrayList<ItemCarrito> getItems() {
        return items;
    }
    public int precio(){
        int resultado=0;
        for(ItemCarrito i:this.items){
            resultado+=i.getPrecioUnitario();
        }
        return resultado;
    }
    
}