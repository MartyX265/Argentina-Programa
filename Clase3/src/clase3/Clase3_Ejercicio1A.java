//Martin Ribotta
package clase3;
import java.util.Scanner;

public class Clase3_Ejercicio1A {
    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese un texto");
        String texto=entrada.nextLine();
        System.out.println("Ingrese una letra a buscar");
        char letra=entrada.next().charAt(0);
        int contador=0;
        char[] array=texto.toCharArray();
        for(char l:array){
            if(l==letra){
                contador++;
            }
        }
        System.out.println(contador);
    }
}
