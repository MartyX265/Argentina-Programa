//Martin Ribotta
package Ejercicio2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/*
 */
public class Ejercicio_2_B {
    public static int OperarDesdeArchivo(String ruta,String operacion){
        int resultado;
        if(operacion.equals("S")){
            resultado=0;
        }else{
            resultado=1;
        }
        try{
            Path rutaArchivo=Paths.get(ruta);
            for(String datos:Files.readAllLines(rutaArchivo)){
                switch(operacion){
                    case "S"->{
                        resultado+=Integer.parseInt(datos);
                    }
                    case "M"->{
                        resultado*=Integer.parseInt(datos);
                    }
                }
            }
        }catch(IOException e){
            System.out.println(e);
            System.out.println("Hubo un error al leer el archivo");
            return 0;
        }
       return resultado;
    }
    public static void main(String[] args){
        String opcion,ruta="D:\\Programacion\\Argentina Programa\\Argentina-Programa\\Clase_4\\numeros.txt";
        Scanner entrada=new Scanner(System.in);
        do{
            System.out.println("Para hacer una sumatoria ingrese (S) y para una multiplicacion ingrese (M)");
            opcion=entrada.next();
            if(opcion.equals("S") || opcion.equals("M")){
                entrada.close();
                break;
            }
            System.out.println("Opcion ingresada no es valida");
        }while(true);
        System.out.println("El resultado de la operacion es: "+OperarDesdeArchivo(ruta,opcion));
    }
}
