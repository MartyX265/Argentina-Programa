
package Ejercicio2;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
/*
 Haga una main donde por parámetro envíe la ruta de un archivo. Ese archivo debe
contener números. El programa debe escribir por consola la suma de esos números
 */
public class Ejercicio_2_A {
    public static int SumarDesdeArchivo(String ruta){
        int sumatoria=0;
        try{
            Path rutaArchivo=Paths.get(ruta);
            for(String datos:Files.readAllLines(rutaArchivo)){
                sumatoria+=Integer.parseInt(datos);
            }
        }catch(IOException e){
            System.out.println(e);
            System.out.println("Hubo un error al leer el archivo");
            return sumatoria;
        }
       return sumatoria;
    }
    public static void main(String[] args){
        String ruta="D:\\Programacion\\Argentina Programa\\Argentina-Programa\\Clase_4\\numeros.txt";
        System.out.println("El resultado es: "+SumarDesdeArchivo(ruta));
    }
}
