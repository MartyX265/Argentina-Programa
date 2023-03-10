
package Ejercicio1;
import java.util.ArrayList;
public class ItemCarrito {
    private ArrayList<Producto> productos=new ArrayList<>();
    private float precioTotalItem;

    public ItemCarrito() {
    }

    public ItemCarrito(float precioTotal) {
        this.precioTotalItem = precioTotal;
    }

    public void setProductos(Producto productos) {
        this.productos.add(productos);
    }

    public void setPrecioTotalItem(float precioTotal) {
        this.precioTotalItem = precioTotal;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public float getPrecioTotalItem() {
        return precioTotalItem;
    }
     
}
