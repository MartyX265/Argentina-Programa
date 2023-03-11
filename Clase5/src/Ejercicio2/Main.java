
package Ejercicio2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Main {
 public static void main(String[] args){
    Carrito carro=new Carrito();
    String nombre=null;
    Integer cantidad=null;
    Integer precio=null;
     try{
        Path listaArticulos=Paths.get("D:\\Programacion\\Argentina Programa\\Argentina-Programa\\Clase5\\articulos.txt");
        for(String datos:Files.readAllLines(listaArticulos)){
            if(cantidad==null){
                cantidad=Integer.valueOf(datos);
            }else if(precio==null){
                precio=Integer.valueOf(datos);
            }else if(nombre==null){
                nombre=datos;
            }
            if(cantidad != null && precio != null && nombre != null){
                for(int i=1;i<=cantidad;i++){
                    carro.setItems(new ItemCarrito(nombre,precio));
                }
                nombre=null;
                cantidad=precio=null;
            }
            
        }
     }catch(IOException e){
         System.out.println("Error al leer el archivo");
         System.out.println(e);
     }
     System.out.println("El precio total del carrito es: "+carro.precio()); 
     
 }   
}
