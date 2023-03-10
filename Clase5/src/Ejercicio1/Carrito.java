
package Ejercicio1;
import java.util.ArrayList;
public class Carrito {
    private ArrayList<ItemCarrito> items=new ArrayList<>();
    private float precioTotal;

    public Carrito() {
    }

    public Carrito(float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void setItems(ItemCarrito item) {
        this.items.add(item);
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public ArrayList<ItemCarrito> getItems() {
        return items;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }
    
    
}
