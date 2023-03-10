/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

public class Producto {
    private Descuento descuentoProducto;
    private String nombre;
    private float precio;
    private String fechaVencimiento;

    public Producto() {
    }

    public Producto(Descuento descuentoProducto, String nombre, float precio, String fechaVencimiento) {
        this.descuentoProducto = descuentoProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.fechaVencimiento = fechaVencimiento;
    }

    public Producto(String nombre, float precio, String fechaVencimiento) {
        this.nombre = nombre;
        this.precio = precio;
        this.fechaVencimiento = fechaVencimiento;
    }
    

    public void setDescuentoProducto(Descuento descuentoProducto) {
        this.descuentoProducto = descuentoProducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Descuento getDescuentoProducto() {
        return descuentoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }
    
    
    
}
