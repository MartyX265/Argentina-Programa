
package Ejercicio2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Main {
 public static void main(String[] args){
     int puntero=0;
     try{
        Path listaArticulos=Paths.get("Clase5\\articulos.txt");
        
     }catch(IOException e){
         System.out.println("Error al leer el archivo");
         System.out.println(e);
     }
     
     
 }   
}
