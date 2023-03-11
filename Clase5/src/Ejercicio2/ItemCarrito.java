
package Ejercicio2;

public class ItemCarrito {
    private String nombreProducto;
    private Integer precioUnitario;

    public ItemCarrito() {
    }

    public ItemCarrito(String nombreProducto, Integer precioUnitario) {
        this.nombreProducto = nombreProducto;
        this.precioUnitario = precioUnitario;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setPrecioUnitario(Integer precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public Integer getPrecioUnitario() {
        return precioUnitario;
    }
    
    
}
