//Martin Ribotta
package Ejercicio3;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
/*Tome el ejercicio B de la clase 3 y que por parámetro se pueda elegir si es una
codificación o decodificación, el valor del desplazo, y 2 archivos, uno para la entrada y
otro para la salida. Que por pantalla solo indique si terminó o no correctamente, los
resultados deben estar en el archivo de salida*/

public class Ejercicio3 {
    public static String Codec(String texto,int desplazamiento,String modo){
        String resultado="";
        String abecedario="abcdefghijklmnñopqrstuvwxyz";
        char caracterActual;
        int indice;
        
        for(int i=0;i<texto.length();i++){
            caracterActual=texto.charAt(i);
            indice=abecedario.indexOf(caracterActual);
            switch(modo){
                case "C"->{
                    if(caracterActual==' '){
                        resultado+='@';
                        break;
                    }
                    if(indice+desplazamiento>abecedario.length()-1){
                        indice=((indice+desplazamiento)-abecedario.length()-1);
                        resultado+=abecedario.charAt(indice);
                    }else{
                        resultado+=abecedario.charAt(indice+desplazamiento);
                    }
                }
                case "D"->{
                    if(caracterActual=='@'){
                        resultado+=' ';
                        break;
                    }
                    if(indice-desplazamiento<0){
                        indice=(abecedario.length()-1)-(indice-desplazamiento);
                        resultado+=abecedario.charAt(indice);
                    }else{
                        resultado+=abecedario.charAt(indice-desplazamiento);
                    } 
                }
            } 
        }
        return resultado+"\n";
    }
    public static void escribirArchivo(String entrada,String salida,String modo,int desplazamiento){
        String aux;
        try{
            Path archivoEntrada=Paths.get(entrada);
            Path archivoSalida=Paths.get(salida);
            for(String mensaje:Files.readAllLines(archivoEntrada)){
                try{
                    aux=Codec(mensaje,desplazamiento,modo);
                    Files.writeString(archivoSalida,aux);
                    aux="";
                }catch(IOException e){
                    System.out.println(e);
                    System.out.println("Hubo un error al escribir en el archivo");
                }
            }
        }catch(IOException e){
            System.out.println(e);
            System.out.println("Hubo un error al leer el archivo");
        }
        
    }
    public static void main(String[] args){
        String rutaEntrada="D:\\Programacion\\Argentina Programa\\Argentina-Programa\\Clase_4\\entrada.txt"
               ,rutaSalida="D:\\Programacion\\Argentina Programa\\Argentina-Programa\\Clase_4\\salida.txt"
               ,modo="C";
        int desplazamiento=1;
        escribirArchivo(rutaEntrada,rutaSalida,modo,desplazamiento);
    }
}
